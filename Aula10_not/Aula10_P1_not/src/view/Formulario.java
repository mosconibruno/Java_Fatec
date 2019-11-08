
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Avaliacao;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblTotalAulas, lblPresencas, lblP1, lblP2, lblP3, lblResultado, lblTitulo, lblQtdeNotas;
    private JTextField txtTotalAulas, txtPresencas, txtP1, txtP2, txtP3;
    private JComboBox cboQtdeNotas;
    private JButton btnCalcularSituacao;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("ELE2 - P1 - noturno - cálculo notas e presenças");
        form.setBounds(400, 150, 550, 400);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        Font fontDestaque = new Font("Arial", Font.BOLD, 14);
        
        lblTitulo = new JLabel("Programa para cálculo de notas e presenças");
        lblTitulo.setBounds(100, 20, 400, 25);
        lblTitulo.setFont(fontDestaque);
        lblTitulo.setForeground(Color.BLUE);
        painel.add(lblTitulo);
        
        lblQtdeNotas = new JLabel("Informe a quantidade de notas:");
        lblQtdeNotas.setBounds(30, 75, 200, 20);
        painel.add(lblQtdeNotas);

        cboQtdeNotas = new JComboBox();
        cboQtdeNotas.addItem("<< SELECIONE >>");
        cboQtdeNotas.addItem("2 valores");
        cboQtdeNotas.addItem("3 valores");
        cboQtdeNotas.setBounds(30, 100, 200, 20);
        cboQtdeNotas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    txtP1.setEnabled((cboQtdeNotas.getSelectedIndex() != 0));
                    txtP2.setEnabled((cboQtdeNotas.getSelectedIndex() != 0));
                    txtP3.setEnabled((cboQtdeNotas.getSelectedIndex() == 2));
                }
            }
        });
        painel.add(cboQtdeNotas);
        
        lblP1 = new JLabel("Nota P1:");
        lblP1.setBounds(30, 135, 100, 20);
        painel.add(lblP1);
        
        txtP1 = new JTextField();
        txtP1.setBounds(30, 160, 80, 20);
        txtP1.setEnabled(false);
        painel.add(txtP1);
        
        lblP2 = new JLabel("Nota P2:");
        lblP2.setBounds(30, 195, 100, 20);
        painel.add(lblP2);
        
        txtP2 = new JTextField();
        txtP2.setBounds(30, 220, 80, 20);
        txtP2.setEnabled(false);
        painel.add(txtP2);
        
        lblP3 = new JLabel("Nota P3:");
        lblP3.setBounds(350, 195, 100, 20);
        painel.add(lblP3);
        
        txtP3 = new JTextField();
        txtP3.setBounds(350, 220, 80, 20);
        txtP3.setEnabled(false);
        painel.add(txtP3);

        lblTotalAulas = new JLabel("Total de aulas:");
        lblTotalAulas.setBounds(350, 75, 100, 20);
        painel.add(lblTotalAulas);
        
        txtTotalAulas = new JTextField();
        txtTotalAulas.setBounds(350, 100, 80, 20);
        painel.add(txtTotalAulas);
        
        lblPresencas = new JLabel("Presenças:");
        lblPresencas.setBounds(350, 135, 100, 20);
        painel.add(lblPresencas);
        
        txtPresencas = new JTextField();
        txtPresencas.setBounds(350, 160, 80, 20);
        painel.add(txtPresencas);
        
        btnCalcularSituacao = new JButton("Calcular situação");
        btnCalcularSituacao.setBounds(180, 260, 150, 25);
        btnCalcularSituacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    Avaliacao objAvaliacao = new Avaliacao();
                    float p1 = Float.parseFloat(txtP1.getText());
                    float p2 = Float.parseFloat(txtP2.getText());
                    float totalAula = Float.parseFloat(txtTotalAulas.getText());
                    float presenca = Float.parseFloat(txtPresencas.getText());
                    if (cboQtdeNotas.getSelectedIndex() == 1)
                        objAvaliacao.calcularMedia(p1, p2);
                    else{
                        float p3 = Float.parseFloat(txtP3.getText());
                        objAvaliacao.calcularMedia(p1, p2, p3);
                    }
                    objAvaliacao.calcularPercentualPresenca(totalAula, presenca);
                    lblResultado.setText("Situação: " + objAvaliacao.retornarSituacao());
                }
            }
        });
        painel.add(btnCalcularSituacao);
        
        lblResultado = new JLabel("Situação:");
        lblResultado.setBounds(160, 300, 200, 30);
        lblResultado.setFont(fontDestaque);
        lblResultado.setForeground(Color.BLUE);
        painel.add(lblResultado);
        
        form.setVisible(true);
    }
    
    private boolean validarPreenchimento(){
        return (cboQtdeNotas.getSelectedIndex() != 0 &&
                !txtP1.getText().isEmpty() &&
                !txtP2.getText().isEmpty() &&
                !txtPresencas.getText().isEmpty() &&
                !txtTotalAulas.getText().isEmpty());
    }
    
}
