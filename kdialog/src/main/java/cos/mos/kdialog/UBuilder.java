package cos.mos.kdialog;

import android.content.Context;
import android.support.annotation.DrawableRes;

/**
 * @Description: <p>
 * @Author: Kosmos
 * @Date: 2019.04.12 15:27
 * @Email: KosmoSakura@gmail.com
 */
public class UBuilder {
    String strTitle, strMsg, strHint, strConfirm, strCancle;
    int iconRes;
    boolean password;//密码模式
    boolean cancelable;
    Context context;
    CancelClick cancelClick;
    ConfirmClick confirmClick;

    public UBuilder(Context context) {
        iconRes = -1;
        strTitle = "";
        strMsg = "";
        strHint = "";
        strConfirm = "";
        strCancle = "";
        password = false;
        confirmClick = null;
        cancelClick = null;
        this.context = context;
    }

    /**
     * @apiNote 不调用、或传入空 则自动处理
     * 开始构建对话框
     */
    public void build() {
        new UDialog(this).show();
    }

    /**
     * @param cancelable 能否返回
     * @apiNote 不调用、或传入空 则不显示该区域
     */
    public UBuilder cancelable(boolean cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    /**
     * @param title 标题
     * @apiNote 不调用、或传入空 则不显示该区域
     */
    public UBuilder title(String title) {
        this.strTitle = title;
        return this;
    }

    /**
     * @param msg 通知内容
     * @apiNote 不调用、或传入空 则不显示该区域
     */
    public UBuilder msg(String msg) {
        this.strMsg = msg;
        return this;
    }

    /**
     * @param hint 输入框提示
     * @apiNote 不调用、或传入空 则不显示该区域
     */
    public UBuilder input(String hint) {
        this.strHint = hint;
        return this;
    }

    /**
     * @param hint     输入框提示
     * @param password 是否是密码模式
     * @apiNote 不调用、或传入空 则不显示该区域
     */
    public UBuilder input(String hint, boolean password) {
        this.strHint = hint;
        this.password = password;
        return this;
    }

    /**
     * @param icon 显示图标
     * @apiNote 不调用、或-1 则不显示该区域
     */
    public UBuilder icon(@DrawableRes int icon) {
        this.iconRes = icon;
        return this;
    }

    /**
     * @apiNote 显示两个默认按钮
     * 两个按钮
     */
    public UBuilder button() {
        this.strConfirm = "确定";
        this.strCancle = "取消";
        return this;
    }

    /**
     * @param confirm 取消按钮
     * @apiNote 不调用、或传入空 则不显示该区域
     * 一个按钮
     */
    public UBuilder button(String confirm) {
        this.strConfirm = confirm;
        return this;
    }

    /**
     * @param confirm 确认按钮
     * @param cancle  取消按钮
     * @apiNote 不调用、或传入空 则不显示该区域
     * 两个按钮
     */
    public UBuilder button(String confirm, String cancle) {
        this.strConfirm = confirm;
        this.strCancle = cancle;
        return this;
    }

    /**
     * @param confirmClick 确认按钮点击事件
     * @apiNote 不调用、或传入空 则自动处理
     */
    public UBuilder confirmClick(ConfirmClick confirmClick) {
        this.confirmClick = confirmClick;
        return this;
    }

    /**
     * @param cancelClick 取消按钮点击事件
     * @apiNote 不调用、或传入空 则自动处理
     * 一个按钮
     */
    public UBuilder cancelClick(CancelClick cancelClick) {
        this.cancelClick = cancelClick;
        return this;
    }
}
