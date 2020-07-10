/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manh.util;

/**
 *
 * @author Duc Manh
 */
//Class này chứa những hàm toán học tính toán gì đó, để giúp cho mọi nơi khác 
//làm cái gì mang tính chất xài xong cho mọi nơi, ta sẽ dùng kĩ thuật 
//STATIC
public class MathUtil {

    //tính n! = 1.2.3.4....n -> n! tăng kết quả rất nhanh, sẽ tràn kiểu ỉt sớm 
    //do int chỉ tối đa 2 tỷ 1, do đó xài long an toàn hơn
    //tuy thế 15! đã là to lắm, mình chỉ tính 15! trở lại
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
