package riansyah.unikom.skripsitrapende.gui;

import javax.swing.JFrame;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import riansyah.unikom.skripsitrapende.services.ServicePenduduk;

@Component
public class FormMenuUtama extends javax.swing.JFrame implements ApplicationContextAware{

    private ServicePenduduk penduduk;
    private ApplicationContext springContext;


    @Autowired
    public void setPenduduk(ServicePenduduk penduduk) {
        this.penduduk = penduduk;
    }
    
    public FormMenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButton = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnPenduduk = new javax.swing.JButton();
        btnKelahiran = new javax.swing.JButton();
        btnKematian = new javax.swing.JButton();
        btnDesaKeluar = new javax.swing.JButton();
        btnDesaMasuk = new javax.swing.JButton();
        btnAgendaSurat = new javax.swing.JButton();
        btnStatistika = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnReferensi = new javax.swing.JButton();
        btnBackUp = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnPengguna = new javax.swing.JButton();
        panelDinamic = new javax.swing.JPanel();
        panelBackground = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miLogin = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        miKeluar = new javax.swing.JMenuItem();
        mMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mTools = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SITRAPENDE - Sistem Informasi Administrasi Kependudukan Desa");
        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnPenduduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people normal.png"))); // NOI18N
        btnPenduduk.setToolTipText("Penduduk");
        btnPenduduk.setBorder(null);
        btnPenduduk.setBorderPainted(false);
        btnPenduduk.setContentAreaFilled(false);
        btnPenduduk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people press.png"))); // NOI18N
        btnPenduduk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people hover.png"))); // NOI18N
        btnPenduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendudukActionPerformed(evt);
            }
        });

        btnKelahiran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birth normal.png"))); // NOI18N
        btnKelahiran.setToolTipText("Kelahiran");
        btnKelahiran.setBorder(null);
        btnKelahiran.setBorderPainted(false);
        btnKelahiran.setContentAreaFilled(false);
        btnKelahiran.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birth press.png"))); // NOI18N
        btnKelahiran.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birth hover.png"))); // NOI18N
        btnKelahiran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelahiranActionPerformed(evt);
            }
        });

        btnKematian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/death normal.png"))); // NOI18N
        btnKematian.setToolTipText("Kematian");
        btnKematian.setBorder(null);
        btnKematian.setBorderPainted(false);
        btnKematian.setContentAreaFilled(false);
        btnKematian.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/death press.png"))); // NOI18N
        btnKematian.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/death hover.png"))); // NOI18N
        btnKematian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKematianActionPerformed(evt);
            }
        });

        btnDesaKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeout normal.png"))); // NOI18N
        btnDesaKeluar.setToolTipText("Keluar Desa");
        btnDesaKeluar.setBorder(null);
        btnDesaKeluar.setBorderPainted(false);
        btnDesaKeluar.setContentAreaFilled(false);
        btnDesaKeluar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeout press.png"))); // NOI18N
        btnDesaKeluar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeout hover.png"))); // NOI18N
        btnDesaKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesaKeluarActionPerformed(evt);
            }
        });

        btnDesaMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homein normal.png"))); // NOI18N
        btnDesaMasuk.setToolTipText("Masuk Desa");
        btnDesaMasuk.setBorder(null);
        btnDesaMasuk.setBorderPainted(false);
        btnDesaMasuk.setContentAreaFilled(false);
        btnDesaMasuk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homein press.png"))); // NOI18N
        btnDesaMasuk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homein hover.png"))); // NOI18N
        btnDesaMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesaMasukActionPerformed(evt);
            }
        });

        btnAgendaSurat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mails normal.png"))); // NOI18N
        btnAgendaSurat.setToolTipText("Agenda Surat");
        btnAgendaSurat.setBorder(null);
        btnAgendaSurat.setBorderPainted(false);
        btnAgendaSurat.setContentAreaFilled(false);
        btnAgendaSurat.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mails press.png"))); // NOI18N
        btnAgendaSurat.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mails hover.png"))); // NOI18N
        btnAgendaSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaSuratActionPerformed(evt);
            }
        });

        btnStatistika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart normal.png"))); // NOI18N
        btnStatistika.setToolTipText("Statistik Penduduk");
        btnStatistika.setBorder(null);
        btnStatistika.setBorderPainted(false);
        btnStatistika.setContentAreaFilled(false);
        btnStatistika.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart press.png"))); // NOI18N
        btnStatistika.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart hover.png"))); // NOI18N
        btnStatistika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikaActionPerformed(evt);
            }
        });

        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report normal.png"))); // NOI18N
        btnLaporan.setToolTipText("Laporan");
        btnLaporan.setBorder(null);
        btnLaporan.setBorderPainted(false);
        btnLaporan.setContentAreaFilled(false);
        btnLaporan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report press.png"))); // NOI18N
        btnLaporan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report hover.png"))); // NOI18N
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        btnReferensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reference normal.png"))); // NOI18N
        btnReferensi.setToolTipText("Referensi");
        btnReferensi.setBorder(null);
        btnReferensi.setBorderPainted(false);
        btnReferensi.setContentAreaFilled(false);
        btnReferensi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reference selected.png"))); // NOI18N
        btnReferensi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reference hover.png"))); // NOI18N
        btnReferensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferensiActionPerformed(evt);
            }
        });

        btnBackUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backup normal.png"))); // NOI18N
        btnBackUp.setToolTipText("Back Up/Restore");
        btnBackUp.setBorder(null);
        btnBackUp.setBorderPainted(false);
        btnBackUp.setContentAreaFilled(false);
        btnBackUp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backup selected.png"))); // NOI18N
        btnBackUp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backup hover.png"))); // NOI18N
        btnBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout normal.png"))); // NOI18N
        btnLogout.setToolTipText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout selected.png"))); // NOI18N
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout hover.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user normal.png"))); // NOI18N
        btnPengguna.setToolTipText("Pengguna");
        btnPengguna.setBorder(null);
        btnPengguna.setBorderPainted(false);
        btnPengguna.setContentAreaFilled(false);
        btnPengguna.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user selected.png"))); // NOI18N
        btnPengguna.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user hover.png"))); // NOI18N
        btnPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenggunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPenduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKelahiran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKematian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesaMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesaKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgendaSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReferensi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReferensi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendaSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesaKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesaMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKematian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKelahiran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1)
                        .addComponent(btnPenduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelDinamic.setBackground(new java.awt.Color(56, 181, 74));
        panelDinamic.setForeground(new java.awt.Color(102, 102, 102));
        panelDinamic.setLayout(new java.awt.CardLayout());

        panelBackground.setBackground(new java.awt.Color(56, 181, 74));

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistem Informasi Administrasi Kependudukan Desa");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgicon2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SITRAPENDE");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator7)
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addComponent(jLabel2))
        );

        panelDinamic.add(panelBackground, "card2");

        mFile.setText("File");

        miLogin.setText("Login");
        mFile.add(miLogin);

        jMenuItem1.setText("Logout");
        mFile.add(jMenuItem1);

        miKeluar.setText("Tutup");
        miKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKeluarActionPerformed(evt);
            }
        });
        mFile.add(miKeluar);

        jMenuBar1.add(mFile);

        mMenu.setText("Menu");

        jMenu3.setText("Pendataan Penduduk");

        jMenuItem2.setText("Penduduk Tetap");
        jMenu3.add(jMenuItem2);

        jMenuItem5.setText("Penduduk Sementara");
        jMenu3.add(jMenuItem5);

        mMenu.add(jMenu3);

        jMenu5.setText("Pelayanan Administrasi");

        jMenu6.setText("Keterangan");

        jMenuItem6.setText("Kelahiran");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Kematian");
        jMenu6.add(jMenuItem7);

        jMenuItem10.setText("Lainnya");
        jMenu6.add(jMenuItem10);

        jMenu5.add(jMenu6);

        jMenu13.setText("Pengantar");

        jMenuItem8.setText("Masuk Desa");
        jMenu13.add(jMenuItem8);

        jMenuItem9.setText("Keluar Desa");
        jMenu13.add(jMenuItem9);

        jMenuItem11.setText("Lainnya");
        jMenu13.add(jMenuItem11);

        jMenu5.add(jMenu13);

        mMenu.add(jMenu5);

        jMenuItem4.setText("Agenda Surat");
        mMenu.add(jMenuItem4);

        jMenuBar1.add(mMenu);

        mTools.setText("Tools");

        jMenu7.setText("Laporan");
        mTools.add(jMenu7);

        jMenu8.setText("Chart");
        mTools.add(jMenu8);

        jMenu9.setText("Back Up");
        mTools.add(jMenu9);

        jMenu10.setText("Pengaturan Referensi");
        mTools.add(jMenu10);

        jMenu11.setText("Pengaturan Pengguna");
        mTools.add(jMenu11);

        jMenuBar1.add(mTools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDinamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDinamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendudukActionPerformed
        PanelPenduduk panelPenduduk = springContext.getBean(PanelPenduduk.class);
        panelDinamic.removeAll();
        panelDinamic.add(panelPenduduk);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnPendudukActionPerformed

    private void btnKelahiranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelahiranActionPerformed
        PanelKelahiran panelKelahiran = new PanelKelahiran();
        panelDinamic.removeAll();
        panelDinamic.add(panelKelahiran);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnKelahiranActionPerformed

    private void btnKematianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKematianActionPerformed
        PanelKematian panelKematian = new PanelKematian();
        panelDinamic.removeAll();
        panelDinamic.add(panelKematian);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnKematianActionPerformed

    private void btnDesaKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesaKeluarActionPerformed
        PanelDesaKeluar panelDesaKeluar = new PanelDesaKeluar();
        panelDinamic.removeAll();
        panelDinamic.add(panelDesaKeluar);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnDesaKeluarActionPerformed

    private void btnDesaMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesaMasukActionPerformed
        PanelDesaMasuk panelDesaMasuk = new PanelDesaMasuk();
        panelDinamic.removeAll();
        panelDinamic.add(panelDesaMasuk);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnDesaMasukActionPerformed

    private void btnAgendaSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaSuratActionPerformed
        PanelAgendaSurat panelAgendaSurat = new PanelAgendaSurat();
        panelDinamic.removeAll();
        panelDinamic.add(panelAgendaSurat);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnAgendaSuratActionPerformed

    private void btnStatistikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikaActionPerformed
        PanelStatistika panelStatistika = new PanelStatistika();
        panelDinamic.removeAll();
        panelDinamic.add(panelStatistika);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnStatistikaActionPerformed

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        PanelLaporan panelLaporan = new PanelLaporan();
        panelDinamic.removeAll();
        panelDinamic.add(panelLaporan);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btnReferensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferensiActionPerformed
        PanelReferensi panelReferensi = new PanelReferensi();
        panelDinamic.removeAll();
        panelDinamic.add(panelReferensi);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnReferensiActionPerformed

    private void btnBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpActionPerformed
        PanelBackUp panelBackUp = new PanelBackUp();
        panelDinamic.removeAll();
        panelDinamic.add(panelBackUp);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnBackUpActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        clearBG();
        FormLogin login = new FormLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenggunaActionPerformed
        PanelPengguna panelPengguna = new PanelPengguna();
        panelDinamic.removeAll();
        panelDinamic.add(panelPengguna);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }//GEN-LAST:event_btnPenggunaActionPerformed

    private void miKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKeluarActionPerformed
        clearBG();
    }//GEN-LAST:event_miKeluarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendaSurat;
    private javax.swing.JButton btnBackUp;
    private javax.swing.JButton btnDesaKeluar;
    private javax.swing.JButton btnDesaMasuk;
    private javax.swing.JButton btnKelahiran;
    private javax.swing.JButton btnKematian;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPenduduk;
    private javax.swing.JButton btnPengguna;
    private javax.swing.JButton btnReferensi;
    private javax.swing.JButton btnStatistika;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenu mTools;
    private javax.swing.JMenuItem miKeluar;
    private javax.swing.JMenuItem miLogin;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelDinamic;
    // End of variables declaration//GEN-END:variables

    public void clearBG(){
        panelDinamic.removeAll();
        panelDinamic.add(panelBackground);
        panelDinamic.repaint();
        panelDinamic.revalidate();
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.springContext = applicationContext;
    }
}
