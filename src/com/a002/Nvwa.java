package com.a002;

import java.util.Scanner;

public class Nvwa {
    Nvwa (){
        System.out.println("我是Nvwa的构造函数！");
    }
    public Nvwa create(String s ){
        if(s.equals("M")){
            Nvwa M =new Man();
            return M;
        }
        if(s.equals("W")){
            Nvwa W = new Woman();
            return W;
        }
        if(s.equals("R")){
            Nvwa R =new Robot();
            return R;
        }
        return null;
    }
    public static void main(String [] args){
        Nvwa N= new Nvwa();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入选项（M W R）");
        String flag=scanner.next();
        N.create(flag);
    }
}


