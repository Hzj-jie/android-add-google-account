package org.gemini.add_google_account;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;

public final class AddGoogleAccountActivity extends Activity
{
    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = new Intent(Settings.ACTION_ADD_ACCOUNT).
                                setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(Settings.EXTRA_ACCOUNT_TYPES, new String[] {"com.google"});
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
