//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package mypro3;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class test1 {
	
	static class Locker
    {
        private String hireName;
        private int cabinetNum;
        private int boxNum;
        private boolean isEmpty=false;
        Locker(){
            hireName="��";
            cabinetNum=0;
            boxNum=0;
            System.out.println("��ţ�"+cabinetNum+" "
                    +"��ţ�"+boxNum+" "
                    +"��ǰ����");
        }
        Locker(String hireName1,int cabinetNum1,int boxNum1){
            hireName=hireName1;
            cabinetNum=cabinetNum1;
            boxNum=boxNum1;
            this.setIsEmpty();
            System.out.println("��ţ�"+cabinetNum+" "
                    +"��ţ�"+boxNum+" "
                    +this.getIsEmpty());
        }
        public String getIsEmpty(){
            if(isEmpty==true) return ("��ǰ��"+this.hireName+"ʹ��");
            else return ("��ǰ����");
        }
        public void setIsEmpty(){
            isEmpty=true;
        }
        public void hasSameName(Locker I){
            if(this.hireName==I.hireName)
                System.out.println("��������ߣ�"+this.hireName);
            System.out.println("��ţ�"+this.cabinetNum+" "+"��ţ�"+this.boxNum);
            System.out.println("��ţ�"+I.cabinetNum+" "+"��ţ�"+I.boxNum);
        }
    }



    static class Matrix{
        private int row;
        private int column;
        private int maxrc;
        private int [][]matrix=new int[maxrc][maxrc];
        Matrix(){
            Scanner sc=new Scanner(System.in);
            System.out.print("�������У����������У���");
            row=sc.nextInt();
            column=sc.nextInt();
            maxrc=(row>column)?row:column;
            this.initMatrix();
        }
        Matrix(int row,int column){
            System.out.println("��������");
            maxrc=(row>column)?row:column;
            this.row=row;
            this.column=column;
            this.initMatrix();
        }
        public void initMatrix(){
            System.out.println("�����ʼ������������Ӧ�����ľ���Ԫ�أ���");
            int arr[][]=new int[maxrc][maxrc];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<row;i++) {
                for(int j=0;j<column;j++)
                    arr[i][j]=sc.nextInt();
            }
            matrix=Arrays.copyOf(arr,(maxrc*maxrc));
            this.printMatrix();
        }
        public void tranMatrix(){
            System.out.println("����ת��");
            int arr[][]=new int[maxrc][maxrc];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++) {
                    arr[j][i]=matrix[i][j];
                }
            }
            int t=row;
            row=column;
            column=t;
            matrix=Arrays.copyOf(arr,(maxrc*maxrc));
            this.printMatrix();
        }
        public void addMatrix(Matrix b){
            if(this.row==b.row&&this.column==b.column){
                System.out.println("�������");
                for(int i=0;i<row;i++)
                    for(int j=0;j<column;j++)
                        this.matrix[i][j]+=b.matrix[i][j];
                this.printMatrix();
            }
            else{
                System.out.println("�������в�һ�£��޷����");
            }
        }
        public void printMatrix(){
            System.out.println("�������");
            for(int i=0;i<row;i++) {
                for (int j = 0; j < column; j++)
                    System.out.format("%8s",matrix[i][j]);

                System.out.println("");
            }
        }
    }
	
    public static void main(String[] args){
        int n;
        System.out.print("ʹ�ö��ٴΣ�");
        Scanner orisc=new Scanner(System.in);
        n=orisc.nextInt();
        for(int i=0;i<n;i++){

        	System.out.println("��һ�⣺Locker�ࣺ");
            Locker L1=new Locker("����",1,1);
            Locker L2=new Locker();
            Locker L3=new Locker("����",2,1);
            L3.hasSameName(L1);

            
            System.out.println("�ڶ��⣺Matrix�ࣺ");
            Matrix M1=new Matrix(4,3);
            M1.tranMatrix();
            Matrix M2=new Matrix(3,4);
            M1.addMatrix(M2);
          
            
        }


    }


}

