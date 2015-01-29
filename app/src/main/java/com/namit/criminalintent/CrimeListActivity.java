package com.namit.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by nkatariy on 1/27/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
