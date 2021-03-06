package com.kevadiyakrunalk.recycleadapter.utils.annotation;

import android.support.annotation.IntDef;

import com.kevadiyakrunalk.recycleadapter.utils.DebugWrapperAdapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef(flag = true, value = {
        DebugWrapperAdapter.FLAG_VERIFY_WRAP_POSITION,
        DebugWrapperAdapter.FLAG_VERIFY_UNWRAP_POSITION,
})
@Retention(RetentionPolicy.SOURCE)
public @interface DebugWrapperAdapterSettingFlags {
}
