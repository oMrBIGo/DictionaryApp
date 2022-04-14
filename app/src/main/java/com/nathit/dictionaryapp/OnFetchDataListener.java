package com.nathit.dictionaryapp;

import com.nathit.dictionaryapp.Model.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
