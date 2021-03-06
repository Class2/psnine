package com.psnine;

import android.app.Application;

import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactApplication;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.reactnative.photoview.PhotoViewPackage;
import com.image.zoom.ReactImageZoom;
import com.cboy.rn.splashscreen.SplashScreenReactPackage;
import com.azendoo.reactnativesnackbar.SnackbarPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import cl.json.RNSharePackage;
import com.mohtada.nestedscrollview.ReactNestedScrollViewPackage;
import com.imagepicker.ImagePickerPackage;
import com.rnfs.RNFSPackage;
import com.idehub.GoogleAnalyticsBridge.GoogleAnalyticsBridgePackage;
import com.airbnb.android.react.lottie.LottiePackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.maornandroidkit.KitsPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNFetchBlobPackage(),
            new PhotoViewPackage(),
            new ReactImageZoom(),
            new SplashScreenReactPackage(),
            new SnackbarPackage(),
            new LinearGradientPackage(),
            new RNSharePackage(),
            new ReactNestedScrollViewPackage(),
            new ImagePickerPackage(),
            new RNFSPackage(),
            new GoogleAnalyticsBridgePackage(),
            new LottiePackage(),
            new VectorIconsPackage(),
            new KitsPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
