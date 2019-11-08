
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Avaliacao;

/**
 *
 * @author lab1
 */
public class Formulario {

    private JFrame form;
    private JLabel lblTotalAulas, lblPresencas, lblProva1, lblProva2,
            lblProva3, lblResultado, lblQtdeNotas;
    private JTextField txtTotalAulas, txtPresencas, txtProva1, txtProva2, txtProva3;
    private JComboBox cboOpcQtdeNotas;
    private JButton btnCalcSit;
    
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("P1 - Cálculo Notas e Presença");
        form.setBounds(400, 150, 550, 400);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        Font fontDestaque = new Font("Arial", Font.BOLD, 14);
        
        lblQtdeNotas = new JLabel("Informe a quantidade de notas:");
        lblQtdeNotas.setBounds(30, 75, 200, 20);
        painel.add(lblQtdeNotas);

        cboOpcQtdeNotas = new JComboBox();
        cboOpcQtdeNotas.addItem("<< SELECIONE >>");
        cboOpcQtdeNotas.addItem("2 valores");
        cboOpcQtdeNotas.addItem("3 valores");
        cboOpcQtdeNotas.setBounds(30, 100, 200, 20);
        cboOpcQtdeNotas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    txtProva1.setEnabled((cboOpcQtdeNotas.getSelectedIndex() != 0));
                    txtProva2.setEnabled((cboOpcQtdeNotas.getSelectedIndex() != 0));
                    txtProva3.setEnabled((cboOpcQtdeNotas.getSelectedIndex() == 2));
                }
            }
        });
        painel.add(cboOpcQtdeNotas);
        
        lblProva1 = new JLabel("Nota P1:");
        lblProva1.setBounds(30, 135, 100, 20);
        painel.add(lblProva1);
        
        txtProva1 = new JTextField();
        txtProva1.setBounds(30, 160, 80, 20);
        txtProva1.setEnabled(false);
        txtProva1.addKeyListener(new KeyListener() {
            // método que ocorre ao digitar qualquer tecla
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            // método que ocorre no momento que a tecla é pressionada
            @Override
            public void keyPressed(KeyEvent e) { }

            // método que ocorre no momento que a tecla é liberada
            @Override
            public void keyReleased(KeyEvent e) {
                lblResultado.setText("Situação:");
                lblResultado.setForeground(Color.BLUE);
            }
        });
        painel.add(txtProva1);
        
        lblProva2 = new JLabel("Nota P2:");
        lblProva2.setBounds(30, 195, 100, 20);
        painel.add(lblProva2);
        
        txtProva2 = new JTextField();
        txtProva2.setBounds(30, 220, 80, 20);
        txtProva2.setEnabled(false);
        txtProva2.addKeyListener(new KeyListener() {
            // método que ocorre ao digitar qualquer tecla
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            // método que ocorre no momento que a tecla é pressionada
            @Override
            public void keyPressed(KeyEvent e) { }

            // método que ocorre no momento que a tecla é liberada
            @Override
            public void keyReleased(KeyEvent e) {
                lblResultado.setText("Situação:");
                lblResultado.setForeground(Color.BLUE);
            }
        });
        painel.add(txtProva2);
        
        lblProva3 = new JLabel("Nota P3:");
        lblProva3.setBounds(350, 195, 100, 20);
        painel.add(lblProva3);
        
        txtProva3 = new JTextField();
        txtProva3.setBounds(350, 220, 80, 20);
        txtProva3.setEnabled(false);
        txtProva3.addKeyListener(new KeyListener() {
            // método que ocorre ao digitar qualquer tecla
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            // método que ocorre no momento que a tecla é pressionada
            @Override
            public void keyPressed(KeyEvent e) { }

            // método que ocorre no momento que a tecla é liberada
            @Override
            public void keyReleased(KeyEvent e) {
                lblResultado.setText("Situação:");
                lblResultado.setForeground(Color.BLUE);
            }
        });
        painel.add(txtProva3);

        lblTotalAulas = new JLabel("Total de aulas:");
        lblTotalAulas.setBounds(350, 75, 100, 20);
        painel.add(lblTotalAulas);
        
        txtTotalAulas = new JTextField();
        txtTotalAulas.setBounds(350, 100, 80, 20);
        txtTotalAulas.addKeyListener(new KeyListener() {
            // método que ocorre ao digitar qualquer tecla
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            // método que ocorre no momento que a tecla é pressionada
            @Override
            public void keyPressed(KeyEvent e) { }

            // método que ocorre no momento que a tecla é liberada
            @Override
            public void keyReleased(KeyEvent e) {
                lblResultado.setText("Situação:");
                lblResultado.setForeground(Color.BLUE);
            }
        });
        painel.add(txtTotalAulas);
        
        lblPresencas = new JLabel("Presenças:");
        lblPresencas.setBounds(350, 135, 100, 20);
        painel.add(lblPresencas);
        
        txtPresencas = new JTextField();
        txtPresencas.setBounds(350, 160, 80, 20);
        txtPresencas.addKeyListener(new KeyListener() {
            // método que ocorre ao digitar qualquer tecla
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            // método que ocorre no momento que a tecla é pressionada
            @Override
            public void keyPressed(KeyEvent e) { }

            // método que ocorre no momento que a tecla é liberada
            @Override
            public void keyReleased(KeyEvent e) {
                lblResultado.setText("Situação:");
                lblResultado.setForeground(Color.BLUE);
            }
        });
        painel.add(txtPresencas);
        
        btnCalcSit = new JButton("Calcular situação");
        btnCalcSit.setBounds(180, 260, 150, 25);
        btnCalcSit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarPreenchimento()){
                    Avaliacao objAvaliacao = new Avaliacao();
                    float p1 = Float.parseFloat(txtProva1.getText());
                    float p2 = Float.parseFloat(txtProva2.getText());
                    float totalAula = Float.parseFloat(txtTotalAulas.getText());
                    float presenca = Float.parseFloat(txtPresencas.getText());
                    if (cboOpcQtdeNotas.getSelectedIndex() == 1)
                        objAvaliacao.calcularMedia(p1, p2);
                    else{
                        float p3 = Float.parseFloat(txtProva3.getText());
                        objAvaliacao.calcularMedia(p1, p2, p3);
                    }
                    objAvaliacao.calcularPercentualPresenca(totalAula, presenca);
                    lblResultado.setText("Situação: " + objAvaliacao.retornarSituacao());
                    if (objAvaliacao.retornarSituacao() == "Reprovado"){
                        lblResultado.setForeground(Color.RED);
                    }
                }
            }
        });
        painel.add(btnCalcSit);
        
        lblResultado = new JLabel("Situação:");
        lblResultado.setBounds(160, 300, 200, 30);
        lblResultado.setFont(fontDestaque);
        lblResultado.setForeground(Color.BLUE);
        painel.add(lblResultado);
        
        form.setVisible(true);
    }
    
    private boolean validarPreenchimento(){
        return (cboOpcQtdeNotas.getSelectedIndex() != 0 &&
                !txtProva1.getText().isEmpty() &&
                !txtProva2.getText().isEmpty() &&
                !txtPresencas.getText().isEmpty() &&
                !txtTotalAulas.getText().isEmpty());
    }
    
     private void validarCaracteresPermitidos(KeyEvent e) {
        String caracteresPermitidos = "0123456789.-";
        if (!caracteresPermitidos.contains(String.valueOf(e.getKeyChar())))
            e.consume();            
    }
}