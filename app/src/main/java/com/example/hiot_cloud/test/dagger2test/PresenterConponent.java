package com.example.hiot_cloud.test.dagger2test;

import com.example.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Component;

/**
 * 测试注入器接口
 */
@Component(modules = TestModule.class)
public interface PresenterConponent {

    void inject(TestMVPActivity testMVPActivity);

}
