package com.example.syp.startactivitywritepermission;

import android.content.Intent;
import android.view.View;

/**
 * Created by syp on 17-5-31.
 */

public class Presenter {

    public void btnStartBActivityClicked(View view) {
        view.getContext().startActivity(new Intent("com.example.anotheractivity.intent.action.BActivity"));
    }
}
