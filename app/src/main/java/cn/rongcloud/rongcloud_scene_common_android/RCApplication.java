package cn.rongcloud.rongcloud_scene_common_android;

import android.app.Application;
import android.text.TextUtils;

import com.basis.utils.SystemUtil;
import cn.rongcloud.config.AppConfig;
import cn.rongcloud.config.init.ModuleManager;
import cn.rongcloud.config.router.ARouterWrapper;
import cn.rongcloud.music.MusicInit;
import cn.rongcloud.pk.PKInit;
import cn.rongcloud.roomkit.RoomKitInit;

public class RCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String process = SystemUtil.getProcessName();
        // 过滤非主进程
        if (!TextUtils.equals(process, getPackageName())) {
            return;
        }
        initConfig();
    }

    void initConfig() {
        ARouterWrapper.init(this);
        AppConfig.get().init(
                BuildConfig.APP_KEY,
                BuildConfig.UM_APP_KEY,
                "rcrtc",
                BuildConfig.BASE_SERVER_ADDRES,
                BuildConfig.BUSINESS_TOKEN,
                BuildConfig.INTERIAL,
                null
        );

        // init rong
        ModuleManager.manager().register(new RoomKitInit(), new MusicInit(), new PKInit());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouterWrapper.destory();
        ModuleManager.manager().unregister();
    }
}
