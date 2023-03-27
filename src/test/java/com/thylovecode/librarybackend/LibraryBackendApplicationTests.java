package com.thylovecode.librarybackend;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testMD5(){
        String s = SecureUtil.md5("131860" + "123");
        System.out.println(s);
    }

}
