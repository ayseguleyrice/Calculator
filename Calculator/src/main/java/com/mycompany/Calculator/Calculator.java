/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework;

import java.util.Scanner;

/**
 *
 * @author ayseguleyrice
 */


public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        
        
        
        
        
        initComponents();
        
         Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen kilonuzu giriniz : ");
        int kilo= scanner.nextInt();
        System.out.println("lutfen boyunuzu giriniz : ");
        double boy=scanner.nextDouble();
        double bki=(kilo/(boy*boy));

        if (bki < 18.5){
            System.out.println("zayifsiniz! ");

        }
        else if (bki>=18.5 && bki<=25){
            System.out.println("Normal kiloya sahipsiniz :) ");

        }
        else if (bki>=25 && bki<=30){
            System.out.println("Fazla kilolusunuz :( ");
        }
        else{
            System.out.println("OBEZSINIZ \uD83D\uDE22 " );
        }

        System.out.println("Vucut kitle indeksiniz : " + bki);
        
    
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        displayTextfield = new javax.swing.JTextField();
        displayLabel = new javax.swing.JLabel();
        percentageBtn = new javax.swing.JButton();
        sqrtBtn = new javax.swing.JButton();
        squareBtn = new javax.swing.JButton();
        reciprocalBtn = new javax.swing.JButton();
        clearEntryBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backspaceBtn = new javax.swing.JButton();
        divisionBtn = new javax.swing.JButton();
        multiplicationBtn = new javax.swing.JButton();
        subtractionBtn = new javax.swing.JButton();
        additionBtn = new javax.swing.JButton();
        decimalBtn = new javax.swing.JButton();
        equalsBtn = new javax.swing.JButton();
        signBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        displayTextfield.setEditable(false);
        displayTextfield.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        displayTextfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        displayTextfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        displayLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        displayLabel.setForeground(new java.awt.Color(0, 204, 102));
        displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        percentageBtn.setBackground(new java.awt.Color(255, 255, 255));
        percentageBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        percentageBtn.setText("%");

        sqrtBtn.setBackground(new java.awt.Color(255, 255, 255));
        sqrtBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sqrtBtn.setText("sqrt");

        squareBtn.setBackground(new java.awt.Color(255, 255, 255));
        squareBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        squareBtn.setText("x2");
        squareBtn.setToolTipText("");

        reciprocalBtn.setBackground(new java.awt.Color(255, 255, 255));
        reciprocalBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reciprocalBtn.setText("1/x");

        clearEntryBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearEntryBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearEntryBtn.setText("CE");
        clearEntryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearBtn.setText("C");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backspaceBtn.setBackground(new java.awt.Color(255, 255, 255));
        backspaceBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backspaceBtn.setText("<--");
        backspaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceBtnActionPerformed(evt);
            }
        });

        divisionBtn.setBackground(new java.awt.Color(255, 255, 255));
        divisionBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divisionBtn.setText("/");
        divisionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBtnActionPerformed(evt);
            }
        });

        multiplicationBtn.setBackground(new java.awt.Color(255, 255, 255));
        multiplicationBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiplicationBtn.setText("x");
        multiplicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationBtnActionPerformed(evt);
            }
        });

        subtractionBtn.setBackground(new java.awt.Color(255, 255, 255));
        subtractionBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subtractionBtn.setText("-");
        subtractionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionBtnActionPerformed(evt);
            }
        });

        additionBtn.setBackground(new java.awt.Color(255, 255, 255));
        additionBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        additionBtn.setText("+");
        additionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionBtnActionPerformed(evt);
            }
        });

        decimalBtn.setBackground(new java.awt.Color(255, 255, 255));
        decimalBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        decimalBtn.setText(".");
        decimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalBtnActionPerformed(evt);
            }
        });

        equalsBtn.setBackground(new java.awt.Color(255, 255, 255));
        equalsBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        equalsBtn.setText("=");
        equalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsBtnActionPerformed(evt);
            }
        });

        signBtn.setBackground(new java.awt.Color(255, 255, 255));
        signBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signBtn.setText("-+");
        signBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBtnActionPerformed(evt);
            }
        });

        sevenBtn.setBackground(new java.awt.Color(255, 255, 255));
        sevenBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("4");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("5");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("6");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setText("3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setText("2");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setText("1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setText("0");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayTextfield)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(percentageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sqrtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(squareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reciprocalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backspaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divisionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiplicationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtractionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(additionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reciprocalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(additionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"0");
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"1");
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"2");
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"3");
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"4");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"5");
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"6");
    }                                         

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        displayTextfield.setText(displayTextfield.getText()+"7");
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"8");
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        displayTextfield.setText(displayTextfield.getText()+"9");
    }                                         

    private void decimalBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(!isDecimal){
            displayTextfield.setText(displayTextfield.getText()+".");
            isDecimal = true;
        }
        
    }                                          

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        displayTextfield.setText("");
        displayLabel.setText("");
    }                                        

    private void clearEntryBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        displayTextfield.setText("");
    }                                             

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String value = displayTextfield.getText();
        
        if(!value.contains("-")){
            displayTextfield.setText("-"+value);
        }else{
            try {
                displayTextfield.setText(value.split("-")[1]);
            } catch (Exception e) {
                displayTextfield.setText("");
            }
        }
    }                                       

    private void backspaceBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String value = displayTextfield.getText();
        int length = value.length();
        
        if(length>0){
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length-1);
            displayTextfield.setText(builder.toString());
        }
    }                                            

    private void additionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        operator = "+";
        if(displayTextfield.getText().length()>0){
            storeOperand(operator);
        }
    }                                           

    private void equalsBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(displayTextfield.getText().length()>0 && displayLabel.getText().length()!=0){
            Double operand2 = Double.parseDouble(displayTextfield.getText());
            
            switch(operator){
                case "+":
                    add(operand1,operand2);
                    break;
                case "-":
                    subtract(operand1,operand2);
                    break;
                case "*":
                    multiply(operand1,operand2);
                    break;
                case "/":
                    divide(operand1,operand2);
                    break;
            }
        }
    }                                         

    private void subtractionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        operator = "-";
        if(displayTextfield.getText().length()>0){
            storeOperand(operator);
        }
    }                                              

    private void multiplicationBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        operator = "*";
        if(displayTextfield.getText().length()>0){
            storeOperand(operator);
        }
    }                                                 

    private void divisionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        operator = "/";
        if(displayTextfield.getText().length()>0){
            storeOperand(operator);
        }
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    private void add(double operand1,double operand2){
        setResult(operand1+operand2);
    }
    private void subtract(double operand1,double operand2){
        setResult(operand1-operand2);
    }
    private void multiply(double operand1,double operand2){
        setResult(operand1*operand2);
    }
    private void divide(double operand1,double operand2){
        setResult(operand1/operand2);
    }
    
    private void setResult(double result){
        displayTextfield.setText(Double.toString(result));
        displayLabel.setText("");
    }
    
    private void storeOperand(String operator){
        String value = displayTextfield.getText();
        operand1 = Double.parseDouble(value);
        
        displayLabel.setText(value + " " + operator);
        displayTextfield.setText("");
    }
    
    private boolean isDecimal = false;
    private String operator;
    private double operand1,operand2;
    // Variables declaration - do not modify                     
    private javax.swing.JButton additionBtn;
    private javax.swing.JButton backspaceBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearEntryBtn;
    private javax.swing.JButton decimalBtn;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JTextField displayTextfield;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton equalsBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton multiplicationBtn;
    private javax.swing.JButton percentageBtn;
    private javax.swing.JButton reciprocalBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton signBtn;
    private javax.swing.JButton sqrtBtn;
    private javax.swing.JButton squareBtn;
    private javax.swing.JButton subtractionBtn;
    // End of variables declaration                   
}

