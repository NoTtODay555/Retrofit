package com.example.napat.githubtest;

import okhttp3.ResponseBody;

interface NetworkCallbackListener {
    void onResponse(User user);

    void onBodyError(ResponseBody responseBodyError);

    void onBodyErrorIsNull();

    void onFailure(Throwable t);
}
