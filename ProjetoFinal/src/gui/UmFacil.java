package gui;

import dominio.Jogo;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class UmFacil extends javax.swing.JInternalFrame {

    public UmFacil() {
        initComponents();

        letrinhas = new JTextField[4];
        letrinhas[0] = jTextField1;
        letrinhas[1] = jTextField2;
        letrinhas[2] = jTextField3;
        letrinhas[3] = jTextField4;

        alfabeto = new JButton[27];
        alfabeto[0] = jButton1;
        alfabeto[1] = jButton2;
        alfabeto[2] = jButton3;
        alfabeto[3] = jButton4;
        alfabeto[4] = jButton5;
        alfabeto[5] = jButton6;
        alfabeto[6] = jButton7;
        alfabeto[7] = jButton8;
        alfabeto[8] = jButton9;
        alfabeto[9] = jButton10;
        alfabeto[10] = jButton11;
        alfabeto[11] = jButton12;
        alfabeto[12] = jButton13;
        alfabeto[13] = jButton14;
        alfabeto[14] = jButton15;
        alfabeto[15] = jButton16;
        alfabeto[16] = jButton17;
        alfabeto[17] = jButton18;
        alfabeto[18] = jButton19;
        alfabeto[19] = jButton20;
        alfabeto[20] = jButton21;
        alfabeto[21] = jButton22;
        alfabeto[22] = jButton23;
        alfabeto[23] = jButton24;
        alfabeto[24] = jButton25;
        alfabeto[25] = jButton26;
        alfabeto[26] = jButton27;

        //estabelesce q não tem palavra2, tem 6 tentativas e o retorno tem 4 de tamanho (nunca chega a retorno2)
        jogo = new Jogo(null, 6, 4, 0);
        jogo.sorteiaPalavra("palavras4letras.txt", 1); //sorteia a primeira palavra
    }

    private void menNovoJogo() {
        JOptionPane.showMessageDialog(this, "Um novo jogo será iniciado!", "NOVO JOGO", JOptionPane.INFORMATION_MESSAGE);

    }

    private void endGame() {
        if (todasLetrasAdivinhadas()) {
            JOptionPane.showMessageDialog(this, "Parabennsss, jogo concluído!! \nVoce acertou a palavra " + this.jogo.getPalavra() + " " + "\nem " + this.jogo.getTentativas() + " tentativas!", "WE ARE CHAMPIONS", JOptionPane.INFORMATION_MESSAGE);
            menNovoJogo();
            novoJogo();
        } else if (jogo.getTentativas() <= 0) {
            JOptionPane.showMessageDialog(this, "Tente de Novo! \nVoce não acertou a palavra " + this.jogo.getPalavra() + "!", "MORTO", JOptionPane.WARNING_MESSAGE);
            menNovoJogo();
            novoJogo();
        }
    }

    private boolean todasLetrasAdivinhadas() {
        for (JTextField letraTextField : letrinhas) {
            if (letraTextField.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void reiniciaTentativas() {
        numTent.setText(String.valueOf(jogo.getTentativas()));
    }

    public void habilitaBotoes(boolean habilitar) {
        for (JButton botao : alfabeto) {
            botao.setEnabled(habilitar);
        }
    }

    public void limparText() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }

    public void novoJogo() {
        limparText();
        habilitaBotoes(true);
        jogo = new Jogo(null, 6, 4, 0);
        jogo.sorteiaPalavra("palavras4letras.txt", 1);
        reiniciaTentativas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoTentativa = new javax.swing.JButton();
        BotaoTentativa1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        BotaoTentativa2 = new javax.swing.JButton();
        BotaoNovoJogo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numTent = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        BotaoTentativa.setBackground(new java.awt.Color(234, 225, 246));
        BotaoTentativa.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BotaoTentativa.setText("Tentativa");
        BotaoTentativa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoTentativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueBotaoTentativa(evt);
            }
        });

        BotaoTentativa1.setBackground(new java.awt.Color(234, 225, 246));
        BotaoTentativa1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BotaoTentativa1.setText("Tentativa");
        BotaoTentativa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoTentativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueBotaoTentativa1(evt);
            }
        });

        setClosable(true);
        setTitle("MODO FÁCIL");

        jPanel1.setBackground(new java.awt.Color(239, 255, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(556, 348));

        jPanel3.setBackground(new java.awt.Color(239, 255, 239));

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton2.setText("W");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton3.setText("E");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton4.setText("R");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton5.setText("T");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton6.setText("Y");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton7.setText("U");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton8.setText("I");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton9.setText("O");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton10.setText("P");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton11.setText("S");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton12.setText("D");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton13.setText("F");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton14.setText("G");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton15.setText("H");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton16.setText("J");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton17.setText("K");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton18.setText("L");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton21.setText("C");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton22.setText("V");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton23.setText("B");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton24.setText("N");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton25.setText("M");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton26.setText("Z");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton27.setText("X");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton1.setText("Q");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton20.setText("A");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton19.setText("Ç");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton26)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23)
                        .addGap(18, 18, 18)
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton11, jButton12, jButton13, jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton2, jButton20, jButton21, jButton22, jButton23, jButton24, jButton25, jButton26, jButton27, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton21)
                    .addComponent(jButton26)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoTentativa2.setBackground(new java.awt.Color(234, 225, 246));
        BotaoTentativa2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BotaoTentativa2.setText("Tentativa");
        BotaoTentativa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoTentativa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueBotaoTentativa(evt);
            }
        });

        BotaoNovoJogo.setBackground(new java.awt.Color(234, 225, 246));
        BotaoNovoJogo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BotaoNovoJogo.setText("Novo Jogo");
        BotaoNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoJogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueBotaoNovoJogo(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(234, 225, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("tentativas!");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Você tem ");

        numTent.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        numTent.setText("6");

        Titulo.setFont(new java.awt.Font("Cambria", 1, 19)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("JOGO DA FORCA - MODO FÁCIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numTent, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoTentativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numTent)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoJogo)
                    .addComponent(BotaoTentativa2))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CliqueBotaoTentativa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliqueBotaoTentativa
        String tentativa = JOptionPane.showInputDialog(this, "Informe sua tentativa", "Tentativa", JOptionPane.QUESTION_MESSAGE);

        if (tentativa != null && tentativa.equalsIgnoreCase(jogo.getPalavra())) {
            JOptionPane.showMessageDialog(this, "ACERTOU!!!", "DESAFIO CONCLUÍDO", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Seu palpite está incorreto! GAME OVER", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        menNovoJogo();
        novoJogo();
    }//GEN-LAST:event_CliqueBotaoTentativa

    private void CliqueBotaoTentativa1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliqueBotaoTentativa1
    }//GEN-LAST:event_CliqueBotaoTentativa1

    private void CliqueBotaoNovoJogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliqueBotaoNovoJogo
        novoJogo();
    }//GEN-LAST:event_CliqueBotaoNovoJogo

    private void AcaoDasLetras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoDasLetras
        String face = ((JButton) evt.getSource()).getText();
        ((JButton) evt.getSource()).setEnabled(false);

        jogo.verificaLetra(face);
        numTent.setText(String.valueOf(jogo.getTentativas()));
        for (int i = 0; i < jogo.getPosicoes().getPosicoesPalavra1().length; i++) {
            if (jogo.getPosicoes().getPosicoesPalavra1()[i] == 1) {
                letrinhas[i].setText(letrinhas[i].getText() + face);
            }
        }
        jogo.getPosicoes().apagaPosicoes(1);
        endGame();
    }//GEN-LAST:event_AcaoDasLetras

    private Jogo jogo;
    private JTextField[] letrinhas;
    private JButton[] alfabeto;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoNovoJogo;
    private javax.swing.JButton BotaoTentativa;
    private javax.swing.JButton BotaoTentativa1;
    private javax.swing.JButton BotaoTentativa2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel numTent;
    // End of variables declaration//GEN-END:variables
}
