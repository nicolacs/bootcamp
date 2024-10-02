package com.bootcamp.demo;

public class MyReadMeNote {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
// !!! Charter 43 
//  - TDD -> 係先寫test case 先至再寫main code 既過程. 
//        -寫少少main就已經先寫test case 先至再寫main code
//  - 有用過maven, 學過 junit, 入面都牽涉polymophsium

// !!! Charter 42
//  - 除左Junit 仲有Hamcrest
//    - 有多幾款唔同既TESTING方法
// !!! Vincent 指最好用既method 係testList()
//    - as 最影響developer 係list of values
//    - hasItem(), not(hasItem()), hasSize(), contains(), containsInAnyOrder()
//    - matcher -> return true false
//    - EG,match string?:("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[a-zA-Z0-9!@#$]{8,16}$");

// !!! Charter 41
//  - Mockito , A call B call C, C錯 雖然B攞C資料會計錯, 但B既PROGRAME可能岩
//      - Mockito就俾fake數據去試 B Method其實可能岩

// Dependency Injection(DI)
//  - 同DB攞野會用到既分離方法
//  - 將個constructor 往外扔, 唔自己定義, 用自己起既其他class做

//!!! 真實發生 /REF: ShoppingCartTest
//    - Mock走個B
//    - Item 要@DATA (當中有Override equal)
// I-BANK interview TEST -> TTD