/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacedafer;

import java.awt.CardLayout;

/**
 *
 * @author Aluno
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPrismas = new javax.swing.JPanel();
        fundoLateralPris = new javax.swing.JPanel();
        botaoPrisTri = new javax.swing.JButton();
        botaoPrisRet = new javax.swing.JButton();
        botaoPrisPent = new javax.swing.JButton();
        botaoPrisHex = new javax.swing.JButton();
        botaoPrisCirc = new javax.swing.JButton();
        fundoMeioPris = new javax.swing.JPanel();
        fundoPrisTri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfieldLBprisTri = new javax.swing.JTextField();
        tfieldAPrisTri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoCalcPrisTri = new javax.swing.JButton();
        resultPrisTri = new javax.swing.JLabel();
        fundoPrisRet = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfieldLBPrisRet = new javax.swing.JTextField();
        tfieldAPrisRet = new javax.swing.JTextField();
        botaoCalcPrisRet = new javax.swing.JButton();
        resultPrisRet = new javax.swing.JLabel();
        fundoPrisPent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfieldLBPrisPent = new javax.swing.JTextField();
        tfieldAPrisPent = new javax.swing.JTextField();
        botaoCalcPrisPent = new javax.swing.JButton();
        resultPrisPent = new javax.swing.JLabel();
        fundoPrisHex = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resultPrisHex = new javax.swing.JLabel();
        tfieldLBPrisHex = new javax.swing.JTextField();
        ifieldAPrisHex = new javax.swing.JTextField();
        botaoCalcPrisHex = new javax.swing.JButton();
        fundoPrisCirc = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfieldRPrisCirc = new javax.swing.JTextField();
        tfieldAPrisCirc = new javax.swing.JTextField();
        botaoCalcPrisCirc = new javax.swing.JButton();
        resultPrisCirc = new javax.swing.JLabel();
        panelPiramides = new javax.swing.JPanel();
        fundoLateralPira = new javax.swing.JPanel();
        botaoPiraTri = new javax.swing.JButton();
        botaoPiraRet = new javax.swing.JButton();
        botaoPiraPent = new javax.swing.JButton();
        botaoPiraHex = new javax.swing.JButton();
        botaoPiraHept = new javax.swing.JButton();
        botaoPiraCirc = new javax.swing.JButton();
        fundoMeioPira = new javax.swing.JPanel();
        fundoPiraTri = new javax.swing.JPanel();
        fundoPiraRet = new javax.swing.JPanel();
        fundoPiraPent = new javax.swing.JPanel();
        fundoPiraHex = new javax.swing.JPanel();
        fundoPiraHept = new javax.swing.JPanel();
        fundoPiraCirc = new javax.swing.JPanel();
        panelOutros = new javax.swing.JPanel();
        fundoLateralOut = new javax.swing.JPanel();
        botaoOutOct = new javax.swing.JButton();
        botaoOutEsf = new javax.swing.JButton();
        fundoMeioOut = new javax.swing.JPanel();
        fundoOutOct = new javax.swing.JPanel();
        fundoOutEsf = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        fundoLateralPris.setBackground(new java.awt.Color(204, 204, 204));

        botaoPrisTri.setText("Heptagonal");
        botaoPrisTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrisTriActionPerformed(evt);
            }
        });

        botaoPrisRet.setText("Retangular");
        botaoPrisRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrisRetActionPerformed(evt);
            }
        });

        botaoPrisPent.setText("Pentagonal");
        botaoPrisPent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrisPentActionPerformed(evt);
            }
        });

        botaoPrisHex.setText("Hexagonal");
        botaoPrisHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrisHexActionPerformed(evt);
            }
        });

        botaoPrisCirc.setText("Triangular");
        botaoPrisCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrisCircActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLateralPrisLayout = new javax.swing.GroupLayout(fundoLateralPris);
        fundoLateralPris.setLayout(fundoLateralPrisLayout);
        fundoLateralPrisLayout.setHorizontalGroup(
            fundoLateralPrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralPrisLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(fundoLateralPrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPrisTri)
                    .addComponent(botaoPrisHex)
                    .addComponent(botaoPrisPent)
                    .addComponent(botaoPrisRet)
                    .addComponent(botaoPrisCirc))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        fundoLateralPrisLayout.setVerticalGroup(
            fundoLateralPrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralPrisLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(botaoPrisCirc)
                .addGap(46, 46, 46)
                .addComponent(botaoPrisRet)
                .addGap(45, 45, 45)
                .addComponent(botaoPrisPent)
                .addGap(43, 43, 43)
                .addComponent(botaoPrisHex)
                .addGap(43, 43, 43)
                .addComponent(botaoPrisTri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoMeioPris.setLayout(new java.awt.CardLayout());

        fundoPrisTri.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Prisma de base triangular");

        tfieldLBprisTri.setText("Lado da base");

        tfieldAPrisTri.setText("Altura do poliedro");

        jLabel2.setText("Insira os valores");

        botaoCalcPrisTri.setText("Calcular!");
        botaoCalcPrisTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcPrisTriActionPerformed(evt);
            }
        });

        resultPrisTri.setText("Resultado:");

        javax.swing.GroupLayout fundoPrisTriLayout = new javax.swing.GroupLayout(fundoPrisTri);
        fundoPrisTri.setLayout(fundoPrisTriLayout);
        fundoPrisTriLayout.setHorizontalGroup(
            fundoPrisTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisTriLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(tfieldLBprisTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(tfieldAPrisTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(fundoPrisTriLayout.createSequentialGroup()
                .addGroup(fundoPrisTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoPrisTriLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(fundoPrisTriLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(botaoCalcPrisTri, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoPrisTriLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(fundoPrisTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(resultPrisTri, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        fundoPrisTriLayout.setVerticalGroup(
            fundoPrisTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisTriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(fundoPrisTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldAPrisTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldLBprisTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(botaoCalcPrisTri)
                .addGap(81, 81, 81)
                .addComponent(resultPrisTri)
                .addGap(80, 80, 80))
        );

        fundoMeioPris.add(fundoPrisTri, "card2");

        fundoPrisRet.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setText("Prisma de base retangular");

        jLabel4.setText("Insira os valores:");

        tfieldLBPrisRet.setText("Lado da base");

        tfieldAPrisRet.setText("Altura do poliedro");

        botaoCalcPrisRet.setText("Calcular!");
        botaoCalcPrisRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcPrisRetActionPerformed(evt);
            }
        });

        resultPrisRet.setText("Resultado:");

        javax.swing.GroupLayout fundoPrisRetLayout = new javax.swing.GroupLayout(fundoPrisRet);
        fundoPrisRet.setLayout(fundoPrisRetLayout);
        fundoPrisRetLayout.setHorizontalGroup(
            fundoPrisRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisRetLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(tfieldLBPrisRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(tfieldAPrisRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(fundoPrisRetLayout.createSequentialGroup()
                .addGroup(fundoPrisRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoPrisRetLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(botaoCalcPrisRet))
                    .addGroup(fundoPrisRetLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(fundoPrisRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultPrisRet, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fundoPrisRetLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoPrisRetLayout.setVerticalGroup(
            fundoPrisRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisRetLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(68, 68, 68)
                .addGroup(fundoPrisRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldLBPrisRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldAPrisRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(botaoCalcPrisRet)
                .addGap(47, 47, 47)
                .addComponent(resultPrisRet)
                .addGap(69, 69, 69))
        );

        fundoMeioPris.add(fundoPrisRet, "card3");

        fundoPrisPent.setBackground(new java.awt.Color(255, 204, 153));

        jLabel5.setText("Prisma de base pentagonal");

        jLabel6.setText("Insira os valores:");

        tfieldLBPrisPent.setText("Lado da base");

        tfieldAPrisPent.setText("Altura do poliedro");

        botaoCalcPrisPent.setText("Calcular!");
        botaoCalcPrisPent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcPrisPentActionPerformed(evt);
            }
        });

        resultPrisPent.setText("jLabel7");

        javax.swing.GroupLayout fundoPrisPentLayout = new javax.swing.GroupLayout(fundoPrisPent);
        fundoPrisPent.setLayout(fundoPrisPentLayout);
        fundoPrisPentLayout.setHorizontalGroup(
            fundoPrisPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisPentLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(tfieldLBPrisPent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(tfieldAPrisPent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(fundoPrisPentLayout.createSequentialGroup()
                .addGroup(fundoPrisPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoPrisPentLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoPrisPentLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(botaoCalcPrisPent))
                    .addGroup(fundoPrisPentLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(fundoPrisPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultPrisPent)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoPrisPentLayout.setVerticalGroup(
            fundoPrisPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisPentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(90, 90, 90)
                .addGroup(fundoPrisPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldLBPrisPent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldAPrisPent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(botaoCalcPrisPent)
                .addGap(52, 52, 52)
                .addComponent(resultPrisPent)
                .addGap(66, 66, 66))
        );

        fundoMeioPris.add(fundoPrisPent, "card4");

        fundoPrisHex.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Prisma de base hexagonal");

        jLabel8.setText("Insira os valores:");

        resultPrisHex.setText("Resultado:");

        tfieldLBPrisHex.setText("Lado da base");

        ifieldAPrisHex.setText("Altura do poliedro");

        botaoCalcPrisHex.setText("Calcular!");
        botaoCalcPrisHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcPrisHexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoPrisHexLayout = new javax.swing.GroupLayout(fundoPrisHex);
        fundoPrisHex.setLayout(fundoPrisHexLayout);
        fundoPrisHexLayout.setHorizontalGroup(
            fundoPrisHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisHexLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(tfieldLBPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(ifieldAPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(fundoPrisHexLayout.createSequentialGroup()
                .addGroup(fundoPrisHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoPrisHexLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel7))
                    .addGroup(fundoPrisHexLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(botaoCalcPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoPrisHexLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(fundoPrisHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoPrisHexLayout.setVerticalGroup(
            fundoPrisHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisHexLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(70, 70, 70)
                .addGroup(fundoPrisHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldLBPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifieldAPrisHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(botaoCalcPrisHex)
                .addGap(67, 67, 67)
                .addComponent(resultPrisHex)
                .addGap(43, 43, 43))
        );

        fundoMeioPris.add(fundoPrisHex, "card5");

        fundoPrisCirc.setBackground(new java.awt.Color(204, 255, 204));
        fundoPrisCirc.setPreferredSize(new java.awt.Dimension(569, 441));

        jLabel9.setText("Cilindro");

        jLabel10.setText("Insira os valores:");

        tfieldRPrisCirc.setText("Raio da base");

        tfieldAPrisCirc.setText("Altura poliedro");

        botaoCalcPrisCirc.setText("Calcular!");
        botaoCalcPrisCirc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcPrisCircActionPerformed(evt);
            }
        });

        resultPrisCirc.setText("Resultado:");

        javax.swing.GroupLayout fundoPrisCircLayout = new javax.swing.GroupLayout(fundoPrisCirc);
        fundoPrisCirc.setLayout(fundoPrisCircLayout);
        fundoPrisCircLayout.setHorizontalGroup(
            fundoPrisCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisCircLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(tfieldRPrisCirc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(tfieldAPrisCirc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(fundoPrisCircLayout.createSequentialGroup()
                .addGroup(fundoPrisCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoPrisCircLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel9))
                    .addGroup(fundoPrisCircLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(botaoCalcPrisCirc))
                    .addGroup(fundoPrisCircLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(fundoPrisCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(resultPrisCirc, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoPrisCircLayout.setVerticalGroup(
            fundoPrisCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPrisCircLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(64, 64, 64)
                .addGroup(fundoPrisCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfieldRPrisCirc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldAPrisCirc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(botaoCalcPrisCirc)
                .addGap(88, 88, 88)
                .addComponent(resultPrisCirc)
                .addGap(33, 33, 33))
        );

        fundoMeioPris.add(fundoPrisCirc, "card6");

        javax.swing.GroupLayout panelPrismasLayout = new javax.swing.GroupLayout(panelPrismas);
        panelPrismas.setLayout(panelPrismasLayout);
        panelPrismasLayout.setHorizontalGroup(
            panelPrismasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrismasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundoLateralPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(fundoMeioPris, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrismasLayout.setVerticalGroup(
            panelPrismasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrismasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrismasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fundoMeioPris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fundoLateralPris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Prismas", panelPrismas);

        fundoLateralPira.setBackground(new java.awt.Color(204, 204, 204));
        fundoLateralPira.setPreferredSize(new java.awt.Dimension(185, 441));

        botaoPiraTri.setText("Triangular");

        botaoPiraRet.setText("Retangular");

        botaoPiraPent.setText("Pentagonal");

        botaoPiraHex.setText("Hexagonal");

        botaoPiraHept.setText("Heptagonal");

        botaoPiraCirc.setText("Circular");

        javax.swing.GroupLayout fundoLateralPiraLayout = new javax.swing.GroupLayout(fundoLateralPira);
        fundoLateralPira.setLayout(fundoLateralPiraLayout);
        fundoLateralPiraLayout.setHorizontalGroup(
            fundoLateralPiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralPiraLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(fundoLateralPiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPiraCirc)
                    .addComponent(botaoPiraHept)
                    .addComponent(botaoPiraHex)
                    .addComponent(botaoPiraPent)
                    .addComponent(botaoPiraRet)
                    .addComponent(botaoPiraTri))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        fundoLateralPiraLayout.setVerticalGroup(
            fundoLateralPiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralPiraLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoPiraTri)
                .addGap(40, 40, 40)
                .addComponent(botaoPiraRet)
                .addGap(45, 45, 45)
                .addComponent(botaoPiraPent)
                .addGap(46, 46, 46)
                .addComponent(botaoPiraHex)
                .addGap(36, 36, 36)
                .addComponent(botaoPiraHept)
                .addGap(35, 35, 35)
                .addComponent(botaoPiraCirc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoMeioPira.setLayout(new java.awt.CardLayout());

        fundoPiraTri.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout fundoPiraTriLayout = new javax.swing.GroupLayout(fundoPiraTri);
        fundoPiraTri.setLayout(fundoPiraTriLayout);
        fundoPiraTriLayout.setHorizontalGroup(
            fundoPiraTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraTriLayout.setVerticalGroup(
            fundoPiraTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraTri, "card2");

        fundoPiraRet.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout fundoPiraRetLayout = new javax.swing.GroupLayout(fundoPiraRet);
        fundoPiraRet.setLayout(fundoPiraRetLayout);
        fundoPiraRetLayout.setHorizontalGroup(
            fundoPiraRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraRetLayout.setVerticalGroup(
            fundoPiraRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraRet, "card3");

        fundoPiraPent.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout fundoPiraPentLayout = new javax.swing.GroupLayout(fundoPiraPent);
        fundoPiraPent.setLayout(fundoPiraPentLayout);
        fundoPiraPentLayout.setHorizontalGroup(
            fundoPiraPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraPentLayout.setVerticalGroup(
            fundoPiraPentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraPent, "card4");

        fundoPiraHex.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout fundoPiraHexLayout = new javax.swing.GroupLayout(fundoPiraHex);
        fundoPiraHex.setLayout(fundoPiraHexLayout);
        fundoPiraHexLayout.setHorizontalGroup(
            fundoPiraHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraHexLayout.setVerticalGroup(
            fundoPiraHexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraHex, "card5");

        fundoPiraHept.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout fundoPiraHeptLayout = new javax.swing.GroupLayout(fundoPiraHept);
        fundoPiraHept.setLayout(fundoPiraHeptLayout);
        fundoPiraHeptLayout.setHorizontalGroup(
            fundoPiraHeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraHeptLayout.setVerticalGroup(
            fundoPiraHeptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraHept, "card7");

        fundoPiraCirc.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout fundoPiraCircLayout = new javax.swing.GroupLayout(fundoPiraCirc);
        fundoPiraCirc.setLayout(fundoPiraCircLayout);
        fundoPiraCircLayout.setHorizontalGroup(
            fundoPiraCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoPiraCircLayout.setVerticalGroup(
            fundoPiraCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioPira.add(fundoPiraCirc, "card6");

        javax.swing.GroupLayout panelPiramidesLayout = new javax.swing.GroupLayout(panelPiramides);
        panelPiramides.setLayout(panelPiramidesLayout);
        panelPiramidesLayout.setHorizontalGroup(
            panelPiramidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPiramidesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundoLateralPira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundoMeioPira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPiramidesLayout.setVerticalGroup(
            panelPiramidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPiramidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPiramidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fundoMeioPira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fundoLateralPira, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pirâmides", panelPiramides);

        fundoLateralOut.setBackground(new java.awt.Color(204, 204, 204));
        fundoLateralOut.setPreferredSize(new java.awt.Dimension(185, 441));

        botaoOutOct.setText("jButton1");

        botaoOutEsf.setText("jButton2");

        javax.swing.GroupLayout fundoLateralOutLayout = new javax.swing.GroupLayout(fundoLateralOut);
        fundoLateralOut.setLayout(fundoLateralOutLayout);
        fundoLateralOutLayout.setHorizontalGroup(
            fundoLateralOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralOutLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(fundoLateralOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoOutEsf)
                    .addComponent(botaoOutOct))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        fundoLateralOutLayout.setVerticalGroup(
            fundoLateralOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLateralOutLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(botaoOutOct)
                .addGap(111, 111, 111)
                .addComponent(botaoOutEsf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoMeioOut.setLayout(new java.awt.CardLayout());

        fundoOutOct.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout fundoOutOctLayout = new javax.swing.GroupLayout(fundoOutOct);
        fundoOutOct.setLayout(fundoOutOctLayout);
        fundoOutOctLayout.setHorizontalGroup(
            fundoOutOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoOutOctLayout.setVerticalGroup(
            fundoOutOctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioOut.add(fundoOutOct, "card2");

        fundoOutEsf.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout fundoOutEsfLayout = new javax.swing.GroupLayout(fundoOutEsf);
        fundoOutEsf.setLayout(fundoOutEsfLayout);
        fundoOutEsfLayout.setHorizontalGroup(
            fundoOutEsfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        fundoOutEsfLayout.setVerticalGroup(
            fundoOutEsfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        fundoMeioOut.add(fundoOutEsf, "card3");

        javax.swing.GroupLayout panelOutrosLayout = new javax.swing.GroupLayout(panelOutros);
        panelOutros.setLayout(panelOutrosLayout);
        panelOutrosLayout.setHorizontalGroup(
            panelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundoLateralOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundoMeioOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOutrosLayout.setVerticalGroup(
            panelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOutrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fundoMeioOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fundoLateralOut, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Outros", panelOutros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPrisCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrisCircActionPerformed
        CardLayout cl = (CardLayout)(fundoMeioPris.getLayout());
        cl.show(fundoMeioPris, "card2");
    }//GEN-LAST:event_botaoPrisCircActionPerformed

    private void botaoPrisRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrisRetActionPerformed
        CardLayout cl = (CardLayout)(fundoMeioPris.getLayout());
        cl.show(fundoMeioPris, "card3");        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPrisRetActionPerformed

    private void botaoPrisPentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrisPentActionPerformed
        CardLayout cl = (CardLayout)(fundoMeioPris.getLayout());
        cl.show(fundoMeioPris, "card4");
    }//GEN-LAST:event_botaoPrisPentActionPerformed

    private void botaoPrisHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrisHexActionPerformed
        CardLayout cl = (CardLayout)(fundoMeioPris.getLayout());
        cl.show(fundoMeioPris, "card5");
    }//GEN-LAST:event_botaoPrisHexActionPerformed

    private void botaoPrisTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrisTriActionPerformed
        CardLayout cl = (CardLayout)(fundoMeioPris.getLayout());
        cl.show(fundoMeioPris, "card6");
    }//GEN-LAST:event_botaoPrisTriActionPerformed

    private void botaoCalcPrisRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcPrisRetActionPerformed
    try{
            double n1 = Double.parseDouble(tfieldLB1prisRet.getText());
            double n2 = Double.parseDouble(tfieldB2prisRet.getText());
            double n3 = Double.parseDouble(tfieldAPrisRet.getText());
            double resultado = Quadrado(n1, n2);
            resultado = Prisma(resultado, n3);
            resultPrisRet.setText("O volume é: " + resultado);

        }catch (NumberFormatException e){
            resultPrisRet.setText("Digite números válidos!");
        }
    }//GEN-LAST:event_botaoCalcPrisRetActionPerformed

    private void botaoCalcPrisTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcPrisTriActionPerformed
        try{
            double n1 = Double.parseDouble(tfieldLBprisTri.getText());
            double n3 = Double.parseDouble(tfieldAPrisTri.getText());
            double resultado = Triangulo(n1);
            resultado = Prisma(resultado, n3);
            resultPrisTri.setText("O volume é: " + resultado);

        }catch (NumberFormatException e){
            resultPrisTri.setText("Digite números válidos!");
        }
    }//GEN-LAST:event_botaoCalcPrisTriActionPerformed

    private void botaoCalcPrisPentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcPrisPentActionPerformed
        try{
            double n1 = Double.parseDouble(tfieldLBPrisPent.getText());
            double n3 = Double.parseDouble(tfieldAPrisPent.getText());
            double resultado = Pentagono(n1);
            resultado = Prisma(resultado, n3);
            resultPrisPent.setText("O volume é: " + resultado);

        }catch (NumberFormatException e){
            resultPrisPent.setText("Digite números válidos!");
        }
    }//GEN-LAST:event_botaoCalcPrisPentActionPerformed

    private void botaoCalcPrisHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcPrisHexActionPerformed
        try{
            double n1 = Double.parseDouble(tfieldLBPrisHex.getText());
            double n3 = Double.parseDouble(ifieldAPrisHex.getText());
            double resultado = Hexagono(n1);
            resultado = Prisma(resultado, n3);
            resultPrisHex.setText("O volume é: " + resultado);

        }catch (NumberFormatException e){
            resultPrisHex.setText("Digite números válidos!");
        }
    }//GEN-LAST:event_botaoCalcPrisHexActionPerformed

    private void botaoCalcPrisCircActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcPrisCircActionPerformed
        try{
            double n1 = Double.parseDouble(tfieldRPrisCirc.getText());
            double n3 = Double.parseDouble(tfieldAPrisCirc.getText());
            double resultado = Circulo(n1);
            resultado = Prisma(resultado, n3);
            resultPrisCirc.setText("O volume é: " + resultado);

        }catch (NumberFormatException e){
            resultPrisCirc.setText("Digite números válidos!");
        }
    }//GEN-LAST:event_botaoCalcPrisCircActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }
    public double Prisma(double base, double height){
        double volume = base * height;
        return volume;
    }
    public double Piramide (double base, double height){
        double volume = (base * height)/3;
        return volume;
    }
    
    public double Quadrado (double bheight, double bbase){
        double area = bheight * bbase;
        return area;
    }
    public double Triangulo (double lado){
        double area = (lado*lado) * 1.73 / 4;
        return area;
    }
    public double Circulo (double raio){
        double area = 3.1415 * (raio*raio);
        return area;
    }
    public double Pentagono (double lado){
        double apotema = lado / (2 * 0.72);
        double area = (5 * lado * apotema) / 2;
        return area;
    }
    public double Hexagono (double lado){
        double area = (3 * (lado*lado)*1.73)/2;
        return area;
    }
    public double Heptagono (double lado){
        double area = (lado*lado) * 3.634;
        return area;
    }
    public double Esfera (double raio){
        double volume = 4/3 * 3.1415 * raio;
        return volume;
    }
    public double Octaedro (double lado){
        double volume = ((lado * lado * lado)* 1.4142)/3;
        return volume;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcPrisCirc;
    private javax.swing.JButton botaoCalcPrisHex;
    private javax.swing.JButton botaoCalcPrisPent;
    private javax.swing.JButton botaoCalcPrisRet;
    private javax.swing.JButton botaoCalcPrisTri;
    private javax.swing.JButton botaoOutEsf;
    private javax.swing.JButton botaoOutOct;
    private javax.swing.JButton botaoPiraCirc;
    private javax.swing.JButton botaoPiraHept;
    private javax.swing.JButton botaoPiraHex;
    private javax.swing.JButton botaoPiraPent;
    private javax.swing.JButton botaoPiraRet;
    private javax.swing.JButton botaoPiraTri;
    private javax.swing.JButton botaoPrisCirc;
    private javax.swing.JButton botaoPrisHex;
    private javax.swing.JButton botaoPrisPent;
    private javax.swing.JButton botaoPrisRet;
    private javax.swing.JButton botaoPrisTri;
    private javax.swing.JPanel fundoLateralOut;
    private javax.swing.JPanel fundoLateralPira;
    private javax.swing.JPanel fundoLateralPris;
    private javax.swing.JPanel fundoMeioOut;
    private javax.swing.JPanel fundoMeioPira;
    private javax.swing.JPanel fundoMeioPris;
    private javax.swing.JPanel fundoOutEsf;
    private javax.swing.JPanel fundoOutOct;
    private javax.swing.JPanel fundoPiraCirc;
    private javax.swing.JPanel fundoPiraHept;
    private javax.swing.JPanel fundoPiraHex;
    private javax.swing.JPanel fundoPiraPent;
    private javax.swing.JPanel fundoPiraRet;
    private javax.swing.JPanel fundoPiraTri;
    private javax.swing.JPanel fundoPrisCirc;
    private javax.swing.JPanel fundoPrisHex;
    private javax.swing.JPanel fundoPrisPent;
    private javax.swing.JPanel fundoPrisRet;
    private javax.swing.JPanel fundoPrisTri;
    private javax.swing.JTextField ifieldAPrisHex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelOutros;
    private javax.swing.JPanel panelPiramides;
    private javax.swing.JPanel panelPrismas;
    private javax.swing.JLabel resultPrisCirc;
    private javax.swing.JLabel resultPrisHex;
    private javax.swing.JLabel resultPrisPent;
    private javax.swing.JLabel resultPrisRet;
    private javax.swing.JLabel resultPrisTri;
    private javax.swing.JTextField tfieldAPrisCirc;
    private javax.swing.JTextField tfieldAPrisPent;
    private javax.swing.JTextField tfieldAPrisRet;
    private javax.swing.JTextField tfieldAPrisTri;
    private javax.swing.JTextField tfieldLBPrisHex;
    private javax.swing.JTextField tfieldLBPrisPent;
    private javax.swing.JTextField tfieldLBPrisRet;
    private javax.swing.JTextField tfieldLBprisTri;
    private javax.swing.JTextField tfieldRPrisCirc;
    // End of variables declaration//GEN-END:variables
}
