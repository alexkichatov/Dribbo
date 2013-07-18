
package com.refactech.driibo.ui.adapter;

import android.os.Build.VERSION;
import android.widget.ListView;

public class ListViewUtils {
    /**
     * 滚动列表到顶端
     * 
     * @param listView
     */
    public static void smoothScrollListViewToTop(final ListView listView) {
        if (listView == null) {
            return;
        }
        smoothScrollListView(listView, 0);
        listView.postDelayed(new Runnable() {

            @Override
            public void run() {
                listView.setSelection(0);
            }
        }, 300);
    }

    /**
     * 滚动列表到position
     * 
     * @param listView
     * @param position
     * @param offset
     * @param duration
     */
    public static void smoothScrollListView(ListView listView, int position) {
        if (VERSION.SDK_INT > 7) {
            listView.smoothScrollToPosition(position);
        } else {
            listView.setSelection(position);
        }
    }
}
