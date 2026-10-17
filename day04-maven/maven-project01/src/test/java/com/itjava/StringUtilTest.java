package com.itjava;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.util.Assert;

//测试类：jUnit单元测试框架，对业务类中的业务方法进行正确性测试
public class StringUtilTest {

    //BeforeAll:用来修饰一个静态方法，该方法会在所有测试方法之前只执行一次
    //主要用来做资源的准备工作
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    //主要用来做资源的释放工作
    //AfterAll:用来修饰一个静态方法，该方法会在所有测试方法之后只执行一次。
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    //主要用来做资源的准备工作
    //BeforeEach:用来修饰一个实例方法，该方法会在每一个测试方法执行之前执行一次。
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    //主要用来做资源的释放工作
    //AfterEach:用来修饰一个实例方法，该方法会在每一个测试方法执行之后执行一次。
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    //测试方法必须是公开的，无返回值
    //测试方法必须加上@Test注解
    @Test
    public void testPrintNumber() {
        //测试步骤
        StringUtil.printNumber("张三");
        //测试用例
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    //指定测试名字用@DisplayName()
    @DisplayName("GetMaxIndex测试")
    @Test
    public void testGetMaxIndex() {
        // 测试步骤:
        int index = StringUtil.getMaxIndex("abcdefg"); // 5
        System.out.println(index);
        // 测试用例
        int index2 = StringUtil.getMaxIndex("");
        int index3 = StringUtil.getMaxIndex(null);
        //                                               三个参数
        //做断言，断言结果与预期是否一致    错误输出信息          预期结果   实际结果
        Assertions.assertEquals(6,index,"输出结果与预期不符合!");
    }


    //参数化测试@ParameterizedTest，用此注解后不需要再用@Test
    @ParameterizedTest
    //选哟指定参数来源，用@ValueSource()
    @ValueSource(strings = {"abcdefg","addd"})
    //在方法中写出参数
    public void testGetMaxIndex2(String cards) {
        // 测试步骤:
        int index = StringUtil.getMaxIndex(cards); // 5
        System.out.println(index);
        //                                               三个参数
        //做断言，断言结果与预期是否一致   预期结果   实际结果         错误输出信息
        Assertions.assertEquals(6,index,"输出结果与预期不符合!");
    }
}
