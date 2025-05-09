package com.luminary.business;

import F0.c;
import F0.f;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends F0.b {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10639a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f10640a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
            f10640a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "additional");
            sparseArray.put(2, "address");
            sparseArray.put(3, "amount");
            sparseArray.put(4, "amountD");
            sparseArray.put(5, "amountDRecive");
            sparseArray.put(6, "amountRecive");
            sparseArray.put(7, "amountText");
            sparseArray.put(8, "availableBalance");
            sparseArray.put(9, "background");
            sparseArray.put(10, "backgroundColor");
            sparseArray.put(11, "backgroundResId");
            sparseArray.put(12, "badgeVisible");
            sparseArray.put(13, "buttonTitle");
            sparseArray.put(14, "cardBackgroundResId");
            sparseArray.put(15, "cardImgResId");
            sparseArray.put(16, "companyText");
            sparseArray.put(17, "count");
            sparseArray.put(18, "countryCode");
            sparseArray.put(19, "countryName");
            sparseArray.put(20, "crypto");
            sparseArray.put(21, FirebaseAnalytics.Param.CURRENCY);
            sparseArray.put(22, "currencyIconRes");
            sparseArray.put(23, "dataList");
            sparseArray.put(24, "date");
            sparseArray.put(25, "description");
            sparseArray.put(26, "descriptionColor");
            sparseArray.put(27, "descriptionDescription");
            sparseArray.put(28, "descriptionDescriptionColor");
            sparseArray.put(29, "destinationAmount");
            sparseArray.put(30, "doOnTextChanged");
            sparseArray.put(31, "emptyTitle");
            sparseArray.put(32, "enabled");
            sparseArray.put(33, "errorText");
            sparseArray.put(34, "feeText");
            sparseArray.put(35, "frozenInfo");
            sparseArray.put(36, "hasArrowDown");
            sparseArray.put(37, "hasDescription");
            sparseArray.put(38, "hasSwitch");
            sparseArray.put(39, "headerText");
            sparseArray.put(40, "height");
            sparseArray.put(41, "heightDP");
            sparseArray.put(42, "hintText");
            sparseArray.put(43, "icon");
            sparseArray.put(44, "iconRes");
            sparseArray.put(45, "image");
            sparseArray.put(46, "incoming");
            sparseArray.put(47, "inputType");
            sparseArray.put(48, "isActivatedOptions");
            sparseArray.put(49, "isActive");
            sparseArray.put(50, "isActivePlan");
            sparseArray.put(51, "isChose");
            sparseArray.put(52, "isClickable");
            sparseArray.put(53, "isCountryCode");
            sparseArray.put(54, "isDeclined");
            sparseArray.put(55, "isDisabled");
            sparseArray.put(56, "isEnabled");
            sparseArray.put(57, "isFirst");
            sparseArray.put(58, "isFlag");
            sparseArray.put(59, "isFrozen");
            sparseArray.put(60, "isGrayText");
            sparseArray.put(61, "isImageVisible");
            sparseArray.put(62, "isImportant");
            sparseArray.put(63, "isInfo");
            sparseArray.put(64, "isLast");
            sparseArray.put(65, "isLeftImage");
            sparseArray.put(66, "isLuminary");
            sparseArray.put(67, "isMultiSelect");
            sparseArray.put(68, "isPhoto");
            sparseArray.put(69, "isRightActive");
            sparseArray.put(70, "isRightVisible");
            sparseArray.put(71, "isSelected");
            sparseArray.put(72, "isSellEnabled");
            sparseArray.put(73, "isSmallIcon");
            sparseArray.put(74, "isVisible1");
            sparseArray.put(75, "isVisible2");
            sparseArray.put(76, "isVisible3");
            sparseArray.put(77, "isVisible4");
            sparseArray.put(78, "isVisible5");
            sparseArray.put(79, "isVisible6");
            sparseArray.put(80, "isVisible7");
            sparseArray.put(81, "isVisible8");
            sparseArray.put(82, "isVisible9");
            sparseArray.put(83, "isWithdrawEnabled");
            sparseArray.put(84, "keyText");
            sparseArray.put(85, "keyText1");
            sparseArray.put(86, "keyText2");
            sparseArray.put(87, "keyText3");
            sparseArray.put(88, "keyText4");
            sparseArray.put(89, "keyText5");
            sparseArray.put(90, "keyText6");
            sparseArray.put(91, "keyText7");
            sparseArray.put(92, "keyText8");
            sparseArray.put(93, "keyText9");
            sparseArray.put(94, "leftText");
            sparseArray.put(95, "marginBottom");
            sparseArray.put(96, "marginTop");
            sparseArray.put(97, "mask");
            sparseArray.put(98, "maximumLength");
            sparseArray.put(99, "metaData");
            sparseArray.put(100, AppMeasurementSdk.ConditionalUserProperty.NAME);
            sparseArray.put(101, "nameText");
            sparseArray.put(102, "numberText");
            sparseArray.put(103, "onAvaChangeClick");
            sparseArray.put(104, "onClick");
            sparseArray.put(105, "onClickAccount");
            sparseArray.put(106, "onClickCart");
            sparseArray.put(107, "onClickData");
            sparseArray.put(108, "onClickDeposit");
            sparseArray.put(109, "onClickFrozen");
            sparseArray.put(110, "onClickInfo");
            sparseArray.put(111, "onClickInput");
            sparseArray.put(112, "onClickLeft");
            sparseArray.put(113, "onClickLogout");
            sparseArray.put(114, "onClickRefresh");
            sparseArray.put(115, "onClickRight");
            sparseArray.put(116, "onClickUnfreeze");
            sparseArray.put(117, "onClickWithdraw");
            sparseArray.put(118, "onItemClick");
            sparseArray.put(119, "onSwitchListener");
            sparseArray.put(120, "onlyClickable");
            sparseArray.put(121, "opt1Label");
            sparseArray.put(122, "opt1Value");
            sparseArray.put(123, "opt2Label");
            sparseArray.put(124, "opt2Value");
            sparseArray.put(125, "percent");
            sparseArray.put(126, "phoneCode");
            sparseArray.put(127, "photoUrl");
            sparseArray.put(128, "positionText");
            sparseArray.put(129, "rightText");
            sparseArray.put(130, "shortName");
            sparseArray.put(131, "shortNameText");
            sparseArray.put(132, "shouldShowRecive");
            sparseArray.put(133, "shouldShowShortName");
            sparseArray.put(134, "shouldShowSmallPoint");
            sparseArray.put(135, "showCounter");
            sparseArray.put(136, "showIcon");
            sparseArray.put(137, "showSeeAll");
            sparseArray.put(138, "showSingleFrozen");
            sparseArray.put(139, "showWarning");
            sparseArray.put(140, "sourceAmount");
            sparseArray.put(141, "startAnimation");
            sparseArray.put(142, "statusIconRes");
            sparseArray.put(143, "statusImageRes");
            sparseArray.put(144, "statusImgResId");
            sparseArray.put(145, "statusText");
            sparseArray.put(146, "subText");
            sparseArray.put(147, TextBundle.TEXT_ENTRY);
            sparseArray.put(148, MessageBundle.TITLE_ENTRY);
            sparseArray.put(149, "titleColor");
            sparseArray.put(150, "titleDescription");
            sparseArray.put(151, "titleDescriptionColor");
            sparseArray.put(152, "titleVisible");
            sparseArray.put(153, "topUpClick");
            sparseArray.put(154, "valueText");
            sparseArray.put(155, "valueText1");
            sparseArray.put(156, "valueText2");
            sparseArray.put(157, "valueText3");
            sparseArray.put(158, "valueText4");
            sparseArray.put(159, "valueText5");
            sparseArray.put(160, "valueText6");
            sparseArray.put(161, "valueText7");
            sparseArray.put(162, "valueText8");
            sparseArray.put(163, "valueText9");
            sparseArray.put(164, "vaultDetailClick");
            sparseArray.put(165, "wayIconRes");
            sparseArray.put(166, "width");
            sparseArray.put(167, "widthDP");
            sparseArray.put(168, "withArrow");
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f10641a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(1);
            f10641a = hashMap;
            hashMap.put("layout/button_small_signer_0", Integer.valueOf(R.layout.button_small_signer));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f10639a = sparseIntArray;
        sparseIntArray.put(R.layout.button_small_signer, 1);
    }

    @Override // F0.b
    public final List<F0.b> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.luminary.business.data.DataBinderMapperImpl());
        arrayList.add(new com.luminary.business.presentation.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // F0.b
    public final String convertBrIdToString(int i) {
        return a.f10640a.get(i);
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View view, int i) {
        int i9 = f10639a.get(i);
        if (i9 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i9 == 1) {
                if (!"layout/button_small_signer_0".equals(tag)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for button_small_signer is invalid. Received: "));
                }
                Object[] h9 = f.h(view, 5, Y4.a.f4101p);
                ConstraintLayout constraintLayout = (ConstraintLayout) h9[0];
                Y4.a aVar = new Y4.a(cVar, view, constraintLayout);
                aVar.f4102o = -1L;
                ((ConstraintLayout) aVar.f27773n).setTag(null);
                view.setTag(R.id.dataBinding, aVar);
                synchronized (aVar) {
                    aVar.f4102o = 1L;
                }
                aVar.i();
                return aVar;
            }
        }
        return null;
    }

    @Override // F0.b
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f10641a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f10639a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
