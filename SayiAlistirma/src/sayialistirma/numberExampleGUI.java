/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sayialistirma;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author TURBOX
 */
public class numberExampleGUI extends javax.swing.JFrame {
   private int Num;
      
    /**
     * Creates new form numberExample
     */
    public numberExampleGUI() {
        initComponents();
        oneRitmik();
        twoRitmik();
        fiveRitmik();
        tenRitmik();
    }
    public void oneRitmik(){
        int numOne=0;
        Random rndmOne=new Random();
        numOne=rndmOne.nextInt(98)+1;
        String SnumOne=String.valueOf(numOne);
        one_CenterTxt.setText(SnumOne);
    }
    public void twoRitmik(){
        int numTwo=0;
        Random rndmTwo=new Random();
        numTwo=2*rndmTwo.nextInt(46)+6;
        String SnumTwo=String.valueOf(numTwo);
        two_CenterTxt.setText(SnumTwo);
    }
     public void fiveRitmik(){
        int numFive=0;
        Random rndmFive=new Random();
        numFive=5*rndmFive.nextInt(16)+15;
        String SnumTwo=String.valueOf(numFive);
        five_CenterTxt.setText(SnumTwo);
    }
      public void tenRitmik(){
        int numTen=0;
        Random rndmTen=new Random();
        numTen=10*rndmTen.nextInt(7)+30;
        String SnumTen=String.valueOf(numTen);
        ten_CenterTxt.setText(SnumTen);
    }
      public void oneControl(String NumOne,String NumTwo,String NumThree,String Nums,String NumFour,String NumFive,String NumSix){
           Num=Integer.parseInt(Nums);
              int NumPOne=(Num)+1;
         int NumPTwo=(Num)+2;
           int NumPThree=(Num)+3;
           int NumMOne=(Num)-1;
           int NumMTwo=(Num)-2;
           int NumMThree=(Num)-3;
           String SNumPOne=String.valueOf(NumPOne);
          String SNumPTwo=String.valueOf(NumPTwo);
           String SNumPThree=String.valueOf(NumPThree);
           String SNumMOne=String.valueOf(NumMOne);
           String SNumMTwo=String.valueOf(NumMTwo);
           String SNumMThree=String.valueOf(NumMThree);

           if(SNumPOne.equals(NumFour)){
              one_fourLbl.setText("Doğru");
              one_fourLbl.setForeground(Color.green);
               System.out.println(SNumPOne);
          }else{
              one_fourLbl.setText("Yanlış");
              one_fourLbl.setForeground(Color.red);
          }
           if(NumFive.equals(SNumPTwo)){
               one_fiveLbl.setText("Doğru");
               one_fiveLbl.setForeground(Color.green);
           }
               else{
                    one_fiveLbl.setText("Yanlış"); 
                    one_fiveLbl.setForeground(Color.red);
                       }
           if(NumSix.equals(SNumPThree)){
               one_sixLbl.setText("Doğru");
               one_sixLbl.setForeground(Color.green);
           }
           else{
               one_sixLbl.setText("Yanlış");
               one_sixLbl.setForeground(Color.red);
           }
           if(NumThree.equals(SNumMOne)){
               one_threeLbl.setText("Doğru");
               one_threeLbl.setForeground(Color.green);
           }else{
               one_threeLbl.setText("Yanlış");
               one_threeLbl.setForeground(Color.red);
           }
           if(NumTwo.equals(SNumMTwo)){
               one_twoLbl.setText("Doğru");
               one_twoLbl.setForeground(Color.green);
           }
           else{
               one_twoLbl.setText("Yanlış");
               one_twoLbl.setForeground(Color.red);
           }
           if(NumOne.equals(SNumMThree)){
               one_oneLbl.setText("Doğru");
               one_oneLbl.setForeground(Color.green);
           }
               else{
                       one_oneLbl.setText("Yanlış");
                       one_oneLbl.setForeground(Color.red);
                       }
           
           
          
      }
      public void twoControl(String NumOne,String NumTwo,String NumThree,String Nums,String NumFour,String NumFive,String NumSix){
           Num=Integer.parseInt(Nums);
              int NumPOne=(Num)+2;
         int NumPTwo=(Num)+4;
           int NumPThree=(Num)+6;
           int NumMOne=(Num)-2;
           int NumMTwo=(Num)-4;
           int NumMThree=(Num)-6;
           String SNumPOne=String.valueOf(NumPOne);
          String SNumPTwo=String.valueOf(NumPTwo);
           String SNumPThree=String.valueOf(NumPThree);
           String SNumMOne=String.valueOf(NumMOne);
           String SNumMTwo=String.valueOf(NumMTwo);
           String SNumMThree=String.valueOf(NumMThree);

           if(SNumPOne.equals(NumFour)){
              two_fourLbl.setText("Doğru");
              two_fourLbl.setForeground(Color.green);
               System.out.println(SNumPOne);
          }else{
              two_fourLbl.setText("Yanlış");
              two_fourLbl.setForeground(Color.red);
          }
           if(NumFive.equals(SNumPTwo)){
               two_fiveLbl.setText("Doğru");
               two_fiveLbl.setForeground(Color.green);
           }
               else{
                    two_fiveLbl.setText("Yanlış");  
                    two_fiveLbl.setForeground(Color.red);
                       }
           if(NumSix.equals(SNumPThree)){
               two_sixLbl.setText("Doğru");
               two_sixLbl.setForeground(Color.green);
           }
           else{
               two_sixLbl.setText("Yanlış");
               two_sixLbl.setForeground(Color.red);
           }
           if(NumThree.equals(SNumMOne)){
               two_threeLbl.setText("Doğru");
               two_threeLbl.setForeground(Color.green);
           }else{
               two_threeLbl.setText("Yanlış");
               two_threeLbl.setForeground(Color.red);
           }
           if(NumTwo.equals(SNumMTwo)){
               two_twoLbl.setText("Doğru");
               two_twoLbl.setForeground(Color.green);
           }
           else{
               two_twoLbl.setText("Yanlış");
               two_twoLbl.setForeground(Color.red);
           }
           if(NumOne.equals(SNumMThree)){
               two_oneLbl.setText("Doğru");
               two_oneLbl.setForeground(Color.green);
           }
               else{
                       two_oneLbl.setText("Yanlış");
                       two_oneLbl.setForeground(Color.red);
                       }
           
           
          
      }
       public void fiveControl(String NumOne,String NumTwo,String NumThree,String Nums,String NumFour,String NumFive,String NumSix){
           Num=Integer.parseInt(Nums);
              int NumPOne=(Num)+5;
         int NumPTwo=(Num)+10;
           int NumPThree=(Num)+15;
           int NumMOne=(Num)-5;
           int NumMTwo=(Num)-10;
           int NumMThree=(Num)-15;
           String SNumPOne=String.valueOf(NumPOne);
          String SNumPTwo=String.valueOf(NumPTwo);
           String SNumPThree=String.valueOf(NumPThree);
           String SNumMOne=String.valueOf(NumMOne);
           String SNumMTwo=String.valueOf(NumMTwo);
           String SNumMThree=String.valueOf(NumMThree);

           if(SNumPOne.equals(NumFour)){
              five_fourLbl.setText("Doğru");
              five_fourLbl.setForeground(Color.green);
               System.out.println(SNumPOne);
          }else{
              five_fourLbl.setText("Yanlış");
              five_fourLbl.setForeground(Color.red);
          }
           if(NumFive.equals(SNumPTwo)){
               five_fiveLbl.setText("Doğru");
               five_fiveLbl.setForeground(Color.green);
           }
               else{
                    five_fiveLbl.setText("Yanlış");
                    five_fiveLbl.setForeground(Color.red);
                       }
           if(NumSix.equals(SNumPThree)){
               five_sixLbl.setText("Doğru");
               five_sixLbl.setForeground(Color.green);
           }
           else{
               five_sixLbl.setText("Yanlış");
               five_sixLbl.setForeground(Color.red);
           }
           if(NumThree.equals(SNumMOne)){
               five_threeLbl.setText("Doğru");
               five_threeLbl.setForeground(Color.green);
           }else{
               five_threeLbl.setText("Yanlış");
               five_threeLbl.setForeground(Color.red);
           }
           if(NumTwo.equals(SNumMTwo)){
               five_twoLbl.setText("Doğru");
               five_twoLbl.setForeground(Color.green);
           }
           else{
               five_twoLbl.setText("Yanlış");
               five_twoLbl.setForeground(Color.red);
           }
           if(NumOne.equals(SNumMThree)){
               five_oneLbl.setText("Doğru");
               five_oneLbl.setForeground(Color.green);
           }
               else{
                       five_oneLbl.setText("Yanlış");
                       five_oneLbl.setForeground(Color.red);
                       }
           
           
          
      }
        public void tenControl(String NumOne,String NumTwo,String NumThree,String Nums,String NumFour,String NumFive,String NumSix){
           Num=Integer.parseInt(Nums);
              int NumPOne=(Num)+10;
         int NumPTwo=(Num)+20;
           int NumPThree=(Num)+30;
           int NumMOne=(Num)-10;
           int NumMTwo=(Num)-20;
           int NumMThree=(Num)-30;
           String SNumPOne=String.valueOf(NumPOne);
          String SNumPTwo=String.valueOf(NumPTwo);
           String SNumPThree=String.valueOf(NumPThree);
           String SNumMOne=String.valueOf(NumMOne);
           String SNumMTwo=String.valueOf(NumMTwo);
           String SNumMThree=String.valueOf(NumMThree);

           if(SNumPOne.equals(NumFour)){
              
              ten_fourLbl.setText("Doğru");
              ten_fourLbl.setForeground(Color.green);
             
              
          }else{
              ten_fourLbl.setText("Yanlış");
              ten_fourLbl.setForeground(Color.red);
          }
           if(NumFive.equals(SNumPTwo)){
               ten_fiveLbl.setText("Doğru");
               ten_fiveLbl.setForeground(Color.green);
           }
               else{
                    ten_fiveLbl.setText("Yanlış");  
                    ten_fiveLbl.setForeground(Color.red);
                       }
           if(NumSix.equals(SNumPThree)){
               ten_sixLbl.setText("Doğru");
               ten_sixLbl.setForeground(Color.green);
           }
           else{
               ten_sixLbl.setText("Yanlış");
               ten_sixLbl.setForeground(Color.red);
           }
           if(NumThree.equals(SNumMOne)){
               ten_threeLbl.setText("Doğru");
               ten_threeLbl.setForeground(Color.green);
           }else{
               ten_threeLbl.setText("Yanlış");
               ten_threeLbl.setForeground(Color.red);
           }
           if(NumTwo.equals(SNumMTwo)){
               ten_twoLbl.setText("Doğru");
               ten_twoLbl.setForeground(Color.green);
           }
           else{
               ten_twoLbl.setText("Yanlış");
               ten_twoLbl.setForeground(Color.red);
           }
           if(NumOne.equals(SNumMThree)){
               ten_oneLbl.setText("Doğru");
               ten_oneLbl.setForeground(Color.green);
           }
               else{
                       ten_oneLbl.setText("Yanlış");
                       ten_oneLbl.setForeground(Color.red);
                       }
           
           
          
      }
        public void newGame(){
            one_CenterTxt.setText(null);
            one_oneTxt.setText(null);
            one_oneLbl.setText(null);
            one_twoTxt.setText(null);
            one_twoLbl.setText(null);
            one_threeTxt.setText(null);
            one_threeLbl.setText(null);
            one_fourTxt.setText(null);
            one_fourLbl.setText(null);
            one_fiveTxt.setText(null);
            one_fiveLbl.setText(null);
            one_sixTxt.setText(null);
            one_sixLbl.setText(null);
            
            two_CenterTxt.setText(null);
            two_oneTxt.setText(null);
            two_oneLbl.setText(null);
            two_twoTxt.setText(null);
            two_twoLbl.setText(null);
            two_threeTxt.setText(null);
            two_threeLbl.setText(null);
            two_fourTxt.setText(null);
            two_fourLbl.setText(null);
            two_fiveTxt.setText(null);
            two_fiveLbl.setText(null);
            two_sixTxt.setText(null);
            two_sixLbl.setText(null);
            
            
            five_CenterTxt.setText(null);
            five_oneTxt.setText(null);
            five_oneLbl.setText(null);
            five_twoTxt.setText(null);
            five_twoLbl.setText(null);
            five_threeTxt.setText(null);
            five_threeLbl.setText(null);
            five_fourTxt.setText(null);
            five_fourLbl.setText(null);
            five_fiveTxt.setText(null);
            five_fiveLbl.setText(null);
            five_sixTxt.setText(null);
            five_sixLbl.setText(null);
            
            
           ten_CenterTxt.setText(null);
            ten_oneTxt.setText(null);
            ten_oneLbl.setText(null);
            ten_twoTxt.setText(null);
            ten_twoLbl.setText(null);
            ten_threeTxt.setText(null);
            ten_threeLbl.setText(null);
            ten_fourTxt.setText(null);
            ten_fourLbl.setText(null);
            ten_fiveTxt.setText(null);
            ten_fiveLbl.setText(null);
            ten_sixTxt.setText(null);
            ten_sixLbl.setText(null);
            
            
            oneRitmik();
            twoRitmik();
            fiveRitmik();
            tenRitmik();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        karsilamaLbl = new javax.swing.JLabel();
        fiveRitmikLbl = new javax.swing.JLabel();
        twoRitmikLbl = new javax.swing.JLabel();
        oneRitmikLbl = new javax.swing.JLabel();
        one_oneTxt = new javax.swing.JTextField();
        one_twoTxt = new javax.swing.JTextField();
        one_threeTxt = new javax.swing.JTextField();
        one_CenterTxt = new javax.swing.JTextField();
        one_fourTxt = new javax.swing.JTextField();
        one_fiveTxt = new javax.swing.JTextField();
        one_sixTxt = new javax.swing.JTextField();
        two_oneTxt = new javax.swing.JTextField();
        two_twoTxt = new javax.swing.JTextField();
        two_threeTxt = new javax.swing.JTextField();
        two_CenterTxt = new javax.swing.JTextField();
        two_fourTxt = new javax.swing.JTextField();
        two_fiveTxt = new javax.swing.JTextField();
        two_sixTxt = new javax.swing.JTextField();
        five_oneTxt = new javax.swing.JTextField();
        five_twoTxt = new javax.swing.JTextField();
        five_threeTxt = new javax.swing.JTextField();
        five_CenterTxt = new javax.swing.JTextField();
        five_fourTxt = new javax.swing.JTextField();
        five_fiveTxt = new javax.swing.JTextField();
        five_sixTxt = new javax.swing.JTextField();
        two_oneLbl = new javax.swing.JLabel();
        two_twoLbl = new javax.swing.JLabel();
        two_threeLbl = new javax.swing.JLabel();
        two_fourLbl = new javax.swing.JLabel();
        two_fiveLbl = new javax.swing.JLabel();
        two_sixLbl = new javax.swing.JLabel();
        one_oneLbl = new javax.swing.JLabel();
        one_twoLbl = new javax.swing.JLabel();
        one_threeLbl = new javax.swing.JLabel();
        one_fourLbl = new javax.swing.JLabel();
        one_fiveLbl = new javax.swing.JLabel();
        one_sixLbl = new javax.swing.JLabel();
        five_oneLbl = new javax.swing.JLabel();
        five_twoLbl = new javax.swing.JLabel();
        five_threeLbl = new javax.swing.JLabel();
        five_fourLbl = new javax.swing.JLabel();
        five_fiveLbl = new javax.swing.JLabel();
        five_sixLbl = new javax.swing.JLabel();
        tenRitmikLbl = new javax.swing.JLabel();
        ten_oneTxt = new javax.swing.JTextField();
        ten_twoTxt = new javax.swing.JTextField();
        ten_threeTxt = new javax.swing.JTextField();
        ten_CenterTxt = new javax.swing.JTextField();
        ten_fourTxt = new javax.swing.JTextField();
        ten_fiveTxt = new javax.swing.JTextField();
        ten_sixTxt = new javax.swing.JTextField();
        ten_sixLbl = new javax.swing.JLabel();
        ten_fiveLbl = new javax.swing.JLabel();
        ten_fourLbl = new javax.swing.JLabel();
        ten_threeLbl = new javax.swing.JLabel();
        ten_twoLbl = new javax.swing.JLabel();
        ten_oneLbl = new javax.swing.JLabel();
        newGameBtn = new javax.swing.JButton();
        controlBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        flagLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));

        karsilamaLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        karsilamaLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        karsilamaLbl.setText("RİTMİK SAYILARI SAYMA OYUNUMUZA HOŞGELDİNİZ...");

        fiveRitmikLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        fiveRitmikLbl.setText("Aşagıdaki Sayıları BEŞER BEŞER Ritmik İleri ve Geri Sayınız...");

        twoRitmikLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        twoRitmikLbl.setText("Aşagıdaki Sayıları İKİŞER İKİŞER Ritmik İleri ve Geri Sayınız...");

        oneRitmikLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        oneRitmikLbl.setText("Aşagıdaki Sayıları BiRER BiRER Ritmik İleri ve Geri Sayınız...");

        one_CenterTxt.setEditable(false);

        two_CenterTxt.setEditable(false);

        five_CenterTxt.setEditable(false);

        two_oneLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        two_twoLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        two_threeLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        two_fourLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        two_fiveLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        two_sixLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_oneLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_twoLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_threeLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_fourLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_fiveLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        one_sixLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_oneLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_twoLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_threeLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_fourLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_fiveLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        five_sixLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        tenRitmikLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        tenRitmikLbl.setText("Aşagıdaki Sayıları ONAR ONAR Ritmik İleri ve Geri Sayınız...");

        ten_CenterTxt.setEditable(false);

        ten_sixLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        ten_fiveLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        ten_fourLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        ten_threeLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        ten_twoLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        ten_oneLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        newGameBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        newGameBtn.setText("YENİ OYUN");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });

        controlBtn1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        controlBtn1.setText("KONTROL ET");
        controlBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel1.setText("<-----------------------Geri     İleri-------------------------->");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(karsilamaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(controlBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(tenRitmikLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveRitmikLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ten_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ten_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(ten_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(five_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(five_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(five_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ten_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(five_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(five_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(twoRitmikLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(oneRitmikLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(two_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(one_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(one_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(two_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(two_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(two_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(two_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(two_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(two_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(one_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(one_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(one_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(one_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(one_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(one_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karsilamaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oneRitmikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoRitmikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiveRitmikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenRitmikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ten_oneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_twoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_threeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_CenterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_fourTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_fiveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_sixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ten_oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_twoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_threeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_fourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_fiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten_sixLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        flagLbl.setBackground(new java.awt.Color(255, 51, 51));
        flagLbl.setForeground(new java.awt.Color(255, 51, 51));
        flagLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flagLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sayialistirma/280318.jpg"))); // NOI18N
        flagLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 51), java.awt.Color.white, null, new java.awt.Color(255, 0, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flagLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(flagLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controlBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBtn1ActionPerformed
        oneControl(one_oneTxt.getText(),one_twoTxt.getText(), one_threeTxt.getText(),one_CenterTxt.getText(),one_fourTxt.getText(),one_fiveTxt.getText(),one_sixTxt.getText());
        twoControl(two_oneTxt.getText(),two_twoTxt.getText(), two_threeTxt.getText(),two_CenterTxt.getText(),two_fourTxt.getText(),two_fiveTxt.getText(),two_sixTxt.getText());
        fiveControl(five_oneTxt.getText(),five_twoTxt.getText(), five_threeTxt.getText(),five_CenterTxt.getText(),five_fourTxt.getText(),five_fiveTxt.getText(),five_sixTxt.getText());
        tenControl(ten_oneTxt.getText(),ten_twoTxt.getText(), ten_threeTxt.getText(),ten_CenterTxt.getText(),ten_fourTxt.getText(),ten_fiveTxt.getText(),ten_sixTxt.getText());
    }//GEN-LAST:event_controlBtn1ActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        newGame();
    }//GEN-LAST:event_newGameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(numberExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(numberExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(numberExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(numberExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new numberExampleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton controlBtn1;
    private javax.swing.JLabel fiveRitmikLbl;
    private javax.swing.JTextField five_CenterTxt;
    private javax.swing.JLabel five_fiveLbl;
    private javax.swing.JTextField five_fiveTxt;
    private javax.swing.JLabel five_fourLbl;
    private javax.swing.JTextField five_fourTxt;
    private javax.swing.JLabel five_oneLbl;
    private javax.swing.JTextField five_oneTxt;
    private javax.swing.JLabel five_sixLbl;
    private javax.swing.JTextField five_sixTxt;
    private javax.swing.JLabel five_threeLbl;
    private javax.swing.JTextField five_threeTxt;
    private javax.swing.JLabel five_twoLbl;
    javax.swing.JTextField five_twoTxt;
    private javax.swing.JLabel flagLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel karsilamaLbl;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JLabel oneRitmikLbl;
    private javax.swing.JTextField one_CenterTxt;
    private javax.swing.JLabel one_fiveLbl;
    private javax.swing.JTextField one_fiveTxt;
    private javax.swing.JLabel one_fourLbl;
    private javax.swing.JTextField one_fourTxt;
    private javax.swing.JLabel one_oneLbl;
    private javax.swing.JTextField one_oneTxt;
    private javax.swing.JLabel one_sixLbl;
    private javax.swing.JTextField one_sixTxt;
    private javax.swing.JLabel one_threeLbl;
    private javax.swing.JTextField one_threeTxt;
    private javax.swing.JLabel one_twoLbl;
    private javax.swing.JTextField one_twoTxt;
    private javax.swing.JLabel tenRitmikLbl;
    private javax.swing.JTextField ten_CenterTxt;
    private javax.swing.JLabel ten_fiveLbl;
    private javax.swing.JTextField ten_fiveTxt;
    private javax.swing.JLabel ten_fourLbl;
    private javax.swing.JTextField ten_fourTxt;
    private javax.swing.JLabel ten_oneLbl;
    private javax.swing.JTextField ten_oneTxt;
    private javax.swing.JLabel ten_sixLbl;
    private javax.swing.JTextField ten_sixTxt;
    private javax.swing.JLabel ten_threeLbl;
    private javax.swing.JTextField ten_threeTxt;
    private javax.swing.JLabel ten_twoLbl;
    private javax.swing.JTextField ten_twoTxt;
    private javax.swing.JLabel twoRitmikLbl;
    private javax.swing.JTextField two_CenterTxt;
    private javax.swing.JLabel two_fiveLbl;
    private javax.swing.JTextField two_fiveTxt;
    private javax.swing.JLabel two_fourLbl;
    private javax.swing.JTextField two_fourTxt;
    private javax.swing.JLabel two_oneLbl;
    private javax.swing.JTextField two_oneTxt;
    private javax.swing.JLabel two_sixLbl;
    private javax.swing.JTextField two_sixTxt;
    private javax.swing.JLabel two_threeLbl;
    private javax.swing.JTextField two_threeTxt;
    private javax.swing.JLabel two_twoLbl;
    private javax.swing.JTextField two_twoTxt;
    // End of variables declaration//GEN-END:variables
      

}
