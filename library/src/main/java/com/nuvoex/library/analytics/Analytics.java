package com.nuvoex.library.analytics;

import android.content.Context;

import java.util.Map;

/**
 * Created by dilip on 05/09/16.
 */
public class Analytics {

    private static AnalyticsService mAnalyticsService;

    public static AnalyticsService getService(Context context) {
        if (mAnalyticsService == null) {
            mAnalyticsService = new FirebaseAnalyticsService(context);
        }

        return mAnalyticsService;
    }

    public static void trackEvent(Context context, String event, Map<String, String> params) {
        getService(context).trackEvent(event, params);
    }

    public static void trackView(Context context, String view, Map<String, String> params) {
        getService(context).trackView(view, params);
    }

    public static void setProperties(Context context, Map<String, String> params) {
        getService(context).setProperties(params);
    }

    public static void setIdentifier(Context context, String id) {
        getService(context).setIdentifier(id);
    }
}
