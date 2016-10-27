package com.wang.www.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wang.www.R;
import com.wang.www.model.MainEntity;
import com.wang.www.util.FrescoUtil;

import java.util.List;

/**
 * Created by user on 2016/2/27.
 * 这是首页Fragment中的ListView--GridView
 */
public class RecommedFragmentLVAdapter extends BaseAdapter {

    private Context context;
    private List<MainEntity.ObjEntity.ShopsEntity> list;

    public RecommedFragmentLVAdapter(Context context, List<MainEntity.ObjEntity.ShopsEntity> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        if(list.size()%2==0){
            return list.size()/2;
        }
        return list.size()/2+1;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.fragment_shops_lv_recommend,null);
            viewHolder.tv1= (TextView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_tv1);
            viewHolder.tv2= (TextView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_tv2);
            viewHolder.tv2= (TextView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_tv2);
            viewHolder.price1= (TextView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_price1);
            viewHolder.price1.setTextColor(Color.parseColor("#ff0011"));
            viewHolder.price2= (TextView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_price2);
            viewHolder.price2.setTextColor(Color.parseColor("#ff0011"));
            viewHolder.sdv1= (SimpleDraweeView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_sdv1);
            viewHolder.sdv2= (SimpleDraweeView) convertView.findViewById(R.id.fragment_shops_lv_recommmend_sdv2);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.tv1.setText(list.get(position * 2).getTitle());
        FrescoUtil.imageViewBind(list.get(position * 2).getImage(), viewHolder.sdv1);
        viewHolder.price1.setText("￥"+list.get(position*2).getPrice()+"/"+list.get(position*2).getGuige());
        if((position*2+1)<list.size()){
            viewHolder.tv2.setText(list.get(position*2+1).getTitle());
            FrescoUtil.imageViewBind(list.get(position * 2 + 1).getImage(), viewHolder.sdv2);
            viewHolder.price2.setText("￥" + list.get(position * 2 + 1).getPrice() + "/" + list.get(position * 2 + 1).getGuige());
        }
        return convertView;
    }
    public class ViewHolder{
        TextView tv1;
        TextView tv2;
        TextView price1;
        TextView price2;
        SimpleDraweeView sdv1;
        SimpleDraweeView sdv2;
    }
}
