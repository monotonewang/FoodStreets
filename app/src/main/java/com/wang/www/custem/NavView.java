package com.wang.www.custem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wang.www.R;


/**
 * Created by user on 2016/2/2.
 */
public class NavView extends FrameLayout {


    //线性布局
    private LinearLayout llChecked,llUnchecked;
    //放什么图片
    private int checkRes,unCheckRes,count;
    private LinearLayout.LayoutParams checkdedLp,uncheckedLp;

    private ImageView checkediv;
    private ImageView uncheckediv;

    private int index;//当前被选中的下标

    public NavView(Context context) {
        super(context);
        init();
    }
    public NavView(Context context, AttributeSet attrs) {
        super(context, attrs);
        getAttrs(attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.nav_layout,this,true);
        llChecked= (LinearLayout) findViewById(R.id.ll_Checked);
        llUnchecked= (LinearLayout) findViewById(R.id.ll_unChecked);
        checkdedLp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        uncheckedLp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        loadView();
    }
    /**
     * 解析自定义属性
     * @param attrs
     */
    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getResources().obtainAttributes(attrs, R.styleable.navView);
        checkRes= typedArray.getResourceId(R.styleable.navView_checkImage,0);
        unCheckRes= typedArray.getResourceId(R.styleable.navView_unCheckImage,0);
        count=typedArray.getInteger(R.styleable.navView_count,0);
        typedArray.recycle();
    }
    public void loadView(){
        if(count>0){
            llChecked.removeAllViews();
            llUnchecked.removeAllViews();
            for(int i=0;i<count;i++){
                uncheckediv =new ImageView(getContext());
                uncheckediv.setImageResource(unCheckRes);
                uncheckediv.setLayoutParams(uncheckedLp);
                uncheckediv.setPadding(5, 0, 5, 0);
                llUnchecked.addView(uncheckediv);
            }
                checkediv=new ImageView(getContext());
                checkediv.setImageResource(checkRes);
                checkediv.setLayoutParams(checkdedLp);
                checkediv.setPadding(5,0,5,0);
                llChecked.addView(checkediv);
        }
    }
    public void setNavAddress(int position){
        LinearLayout.LayoutParams layoutParams= (LinearLayout.LayoutParams) checkediv.getLayoutParams();
        layoutParams.leftMargin=checkediv.getWidth()*(position);
        checkediv.setLayoutParams(layoutParams);
    }
    /**
     * 结合ViewPager使用的方法
     * @param position
     * @param pyl
     */
    public void setNavAddressScroll(int position, float pyl){
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) checkediv.getLayoutParams();
        layoutParams.leftMargin = (int) (checkediv.getWidth() * (position + pyl));
        checkediv.setLayoutParams(layoutParams);

        index = position;
    }
    public void setCount(int count){
        this.count=count;
        loadView();//重新加载控件
    }
    public int getCount(){
        return this.count;
    }
}
