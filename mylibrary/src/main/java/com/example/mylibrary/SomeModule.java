package com.example.mylibrary;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class SomeModule {

    @Provides
    static DbUser provideSomeDbClass() {
        return new DbUser(null);
    }
}
