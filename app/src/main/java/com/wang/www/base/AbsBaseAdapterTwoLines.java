package com.wang.www.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wang.www.util.FrescoUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2016/2/27.
 */
public abstract class AbsBaseAdapterTwoLines<T> extends BaseAdapter {


    private Context context;
    private List<T> datas;
    private int resid;

    public AbsBaseAdapterTwoLines(Context context, int resid) {
        this.context = context;
        this.resid = resid;
        datas = new ArrayList<T>();
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    public void addDatas(List<T> datas) {
        this.datas.addAll(datas);
        this.notifyDataSetChanged();
    }

    //回调方法，系统在绘制adapterview的时候首先回调该方法
    //计算总共要绘制的item的个数，如果返回0，就不绘制
    //如果返回1，就绘制一个item
    //所以，一般就是数据有多少条就返回多少
    @Override
    public int getCount() {
        if(datas.size()%2==0){
            return datas.size()/2;
        }
        return datas.size()/2+1;
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(context).inflate(resid, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }

        // 进行赋值的操作
        bindDatas(viewHolder, datas.get(position));

        return convertView;
    }

    public abstract void bindDatas(ViewHolder viewHolder, T data);

    /**
     * 创建ViewHolder
     *
     * @author Ken
     */
    public class ViewHolder {
        /**
         * 该Map用于缓存布局中的控件
         */
        Map<Integer, View> cacheMap = new HashMap();
        View layoutView;

        /**
         * 该构造参数 需要传递一个布局对象过来
         *
         * @param layoutView
         */
        public ViewHolder(View layoutView) {
            this.layoutView = layoutView;
        }

        /**
         * 通过控件ID 找到该控件
         *
         * @param id
         * @return
         */
        public View getView(int id) {
            if (cacheMap.containsKey(id)) {
                return cacheMap.get(id);
            } else {
                View view = layoutView.findViewById(id);
                cacheMap.put(id, view);
                return view;
            }
        }

        /**
         * 绑定TextView
         *
         * @param id
         * @param text
         * @return
         */
        public ViewHolder bindTextView(int id, String text) {
            TextView tv = (TextView) getView(id);
            tv.setText(text);
            return this;
        }
        //这里要修改一下

        /**
         * 绑定CacheImageView
         *
         * @param id
         * @param url
         * @return
         *//*
        public ViewHolder bindCacheImageView(int id, String url) {
			CacheImageView civ = (CacheImageView) getView(id);
			civ.setUrl(url);
			return this;
		}*/
        public ViewHolder bindSimpleDraweeView(int id, String url) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) getView(id);
            FrescoUtil.imageViewBind(url, simpleDraweeView);
            return this;
        }
    }

}
