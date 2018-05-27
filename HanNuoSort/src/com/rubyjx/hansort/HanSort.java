package com.rubyjx.hansort;

/**
 * @PackageName com.rubyjx.hansort
 * @Class HanSort
 * @Author leaves
 * @Date 2018/5/27 23 22
 * @Describe
 */
public class HanSort {
    private int i = 1;
    public  void HanNuoSort(int n, char from, char dependOn, char to){
          if(1==n){
              move(from , to);
          }else{
              HanNuoSort(n-1, from, to , dependOn);
              move(from, to);
              HanNuoSort(n-1, dependOn, from, to);
          }

    }

    private void move(char from, char to) {
        System.out.println("第"+i+++"次从"+from+"到"+to);
    }

    public static void main(String[] args) {
        HanSort hs=new HanSort();
        hs.HanNuoSort(1, 'A', 'B', 'C');
    }
}
