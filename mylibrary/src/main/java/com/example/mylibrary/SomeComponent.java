package com.example.mylibrary;

import dagger.Component;

@Component(modules = SomeModule.class)
public interface SomeComponent {

    Class3 provideClass3();
}
