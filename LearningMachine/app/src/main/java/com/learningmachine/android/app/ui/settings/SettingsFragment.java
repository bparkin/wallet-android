package com.learningmachine.android.app.ui.settings;

<<<<<<< HEAD
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learningmachine.android.app.R;
import com.learningmachine.android.app.databinding.FragmentSettingsBinding;
import com.learningmachine.android.app.ui.LearningMachineFragment;
=======
import com.learningmachine.android.app.ui.LMFragment;
>>>>>>> master

public class SettingsFragment extends LMFragment {

    private FragmentSettingsBinding mBinding;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false);

        return mBinding.getRoot();
    }
}


