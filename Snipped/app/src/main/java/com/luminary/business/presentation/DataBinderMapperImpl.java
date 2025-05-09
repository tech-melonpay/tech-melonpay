package com.luminary.business.presentation;

import F0.c;
import F0.f;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.business.presentation.ui.views.CodeTextView;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.PassportService;
import t6.A0;
import t6.A1;
import t6.A6;
import t6.B1;
import t6.B2;
import t6.B3;
import t6.B4;
import t6.B5;
import t6.C0;
import t6.C1282B;
import t6.C1283C;
import t6.C1285E;
import t6.C1287G;
import t6.C1288a;
import t6.C1289a0;
import t6.C1290a1;
import t6.C1294a5;
import t6.C1295a6;
import t6.C1298b1;
import t6.C1299b2;
import t6.C1300b3;
import t6.C1301b4;
import t6.C1304c;
import t6.C1305c0;
import t6.C1307c2;
import t6.C1310c5;
import t6.C1311c6;
import t6.C1314d1;
import t6.C1316d3;
import t6.C1317d4;
import t6.C1320e;
import t6.C1321e0;
import t6.C1322e1;
import t6.C1323e2;
import t6.C1326e5;
import t6.C1327e6;
import t6.C1331f2;
import t6.C1332f3;
import t6.C1333f4;
import t6.C1336g;
import t6.C1337g0;
import t6.C1338g1;
import t6.C1342g5;
import t6.C1343g6;
import t6.C1345h0;
import t6.C1347h2;
import t6.C1348h3;
import t6.C1349h4;
import t6.C1352i;
import t6.C1354i1;
import t6.C1357i4;
import t6.C1358i5;
import t6.C1359i6;
import t6.C1361j0;
import t6.C1363j2;
import t6.C1364j3;
import t6.C1368k;
import t6.C1370k1;
import t6.C1371k2;
import t6.C1373k4;
import t6.C1374k5;
import t6.C1375k6;
import t6.C1377l0;
import t6.C1378l1;
import t6.C1380l3;
import t6.C1381l4;
import t6.C1384m;
import t6.C1387m2;
import t6.C1390m5;
import t6.C1391m6;
import t6.C1392n;
import t6.C1393n0;
import t6.C1394n1;
import t6.C1395n2;
import t6.C1396n3;
import t6.C1397n4;
import t6.C1401o0;
import t6.C1406o5;
import t6.C1407o6;
import t6.C1408p;
import t6.C1410p1;
import t6.C1411p2;
import t6.C1412p3;
import t6.C1413p4;
import t6.C1417q0;
import t6.C1418q1;
import t6.C1422q5;
import t6.C1423q6;
import t6.C1426r2;
import t6.C1427r3;
import t6.C1428r4;
import t6.C1429r5;
import t6.C1432s0;
import t6.C1433s1;
import t6.C1438t;
import t6.C1441t2;
import t6.C1442t3;
import t6.C1443t4;
import t6.C1444t5;
import t6.C1446u0;
import t6.C1447u1;
import t6.C1452v;
import t6.C1455v2;
import t6.C1456v3;
import t6.C1457v4;
import t6.C1458v5;
import t6.C1460w0;
import t6.C1461w1;
import t6.C1466x;
import t6.C1467x0;
import t6.C1469x2;
import t6.C1470x3;
import t6.C1471x4;
import t6.C1472x5;
import t6.C1475y1;
import t6.C1476y2;
import t6.C1480z;
import t6.C1481z0;
import t6.C1483z2;
import t6.C1484z3;
import t6.C1485z4;
import t6.C1486z5;
import t6.C6;
import t6.D1;
import t6.D2;
import t6.D3;
import t6.D4;
import t6.D5;
import t6.E0;
import t6.E6;
import t6.F1;
import t6.F2;
import t6.F3;
import t6.F4;
import t6.F5;
import t6.F6;
import t6.G0;
import t6.G6;
import t6.H1;
import t6.H2;
import t6.H3;
import t6.H4;
import t6.H5;
import t6.H6;
import t6.I;
import t6.I0;
import t6.J0;
import t6.J1;
import t6.J2;
import t6.J3;
import t6.J4;
import t6.J5;
import t6.J6;
import t6.K;
import t6.L;
import t6.L0;
import t6.L1;
import t6.L2;
import t6.L3;
import t6.L4;
import t6.L5;
import t6.L6;
import t6.N;
import t6.N0;
import t6.N1;
import t6.N2;
import t6.N3;
import t6.N4;
import t6.N5;
import t6.N6;
import t6.O6;
import t6.P;
import t6.P0;
import t6.P1;
import t6.P2;
import t6.P3;
import t6.P4;
import t6.P5;
import t6.Q;
import t6.Q3;
import t6.Q6;
import t6.R0;
import t6.R1;
import t6.R2;
import t6.R4;
import t6.R5;
import t6.R6;
import t6.S3;
import t6.S5;
import t6.T;
import t6.T0;
import t6.T1;
import t6.T2;
import t6.T4;
import t6.T5;
import t6.U0;
import t6.U3;
import t6.U5;
import t6.V;
import t6.V1;
import t6.V2;
import t6.V4;
import t6.W0;
import t6.W3;
import t6.W5;
import t6.X;
import t6.X1;
import t6.X2;
import t6.X4;
import t6.Y;
import t6.Y0;
import t6.Y1;
import t6.Y3;
import t6.Y4;
import t6.Y5;
import t6.Z1;
import t6.Z2;
import t6.Z3;
import t6.r;
import t6.s6;
import t6.u6;
import t6.w6;
import t6.y6;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends F0.b {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11161a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11162a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
            f11162a = sparseArray;
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
        public static final HashMap<String, Integer> f11163a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(231);
            f11163a = hashMap;
            androidx.camera.core.impl.utils.a.s(R.layout.activity_error, hashMap, "layout/activity_error_0", R.layout.activity_main, "layout/activity_main_0");
            androidx.camera.core.impl.utils.a.s(R.layout.activity_passcode, hashMap, "layout/activity_passcode_0", R.layout.activity_splash, "layout/activity_splash_0");
            androidx.camera.core.impl.utils.a.s(R.layout.base_bottom_sheet, hashMap, "layout/base_bottom_sheet_0", R.layout.bottom_dialog, "layout/bottom_dialog_0");
            androidx.camera.core.impl.utils.a.s(R.layout.button_small, hashMap, "layout/button_small_0", R.layout.cell_account, "layout/cell_account_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_account_carousel, hashMap, "layout/cell_account_carousel_0", R.layout.cell_account_crypto_carousel, "layout/cell_account_crypto_carousel_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_account_crypto_details_top, hashMap, "layout/cell_account_crypto_details_top_0", R.layout.cell_account_details_top, "layout/cell_account_details_top_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_account_horisontal, hashMap, "layout/cell_account_horisontal_0", R.layout.cell_account_horisontal_old, "layout/cell_account_horisontal_old_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_account_tab, hashMap, "layout/cell_account_tab_0", R.layout.cell_accounts_details_bank_middle, "layout/cell_accounts_details_bank_middle_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_accounts_details_middle, hashMap, "layout/cell_accounts_details_middle_0", R.layout.cell_bank_acoount, "layout/cell_bank_acoount_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_business_profile, hashMap, "layout/cell_business_profile_0", R.layout.cell_card_carousel_item, "layout/cell_card_carousel_item_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_card_details, hashMap, "layout/cell_card_details_0", R.layout.cell_card_small, "layout/cell_card_small_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_card_vault, hashMap, "layout/cell_card_vault_0", R.layout.cell_cards_tab, "layout/cell_cards_tab_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_cardtransaction_middle, hashMap, "layout/cell_cardtransaction_middle_0", R.layout.cell_company, "layout/cell_company_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_company_header_new, hashMap, "layout/cell_company_header_new_0", R.layout.cell_company_new, "layout/cell_company_new_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_country, hashMap, "layout/cell_country_0", R.layout.cell_create_company, "layout/cell_create_company_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_crypto_account_tab, hashMap, "layout/cell_crypto_account_tab_0", R.layout.cell_crypto_tab, "layout/cell_crypto_tab_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_crypto_wallet, hashMap, "layout/cell_crypto_wallet_0", R.layout.cell_data_1, "layout/cell_data_1_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_data_2, hashMap, "layout/cell_data_2_0", R.layout.cell_end_space, "layout/cell_end_space_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_excahnge_account, hashMap, "layout/cell_excahnge_account_0", R.layout.cell_excahnge_account_header, "layout/cell_excahnge_account_header_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_exchange_crypto_action_required_item, hashMap, "layout/cell_exchange_crypto_action_required_item_0", R.layout.cell_exchange_crypto_new_item, "layout/cell_exchange_crypto_new_item_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_exchange_middle, hashMap, "layout/cell_exchange_middle_0", R.layout.cell_exchanges_tab, "layout/cell_exchanges_tab_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_header, hashMap, "layout/cell_header_0", R.layout.cell_header_16_top, "layout/cell_header_16_top_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_header_top, hashMap, "layout/cell_header_top_0", R.layout.cell_header_top_blue, "layout/cell_header_top_blue_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_home_tab, hashMap, "layout/cell_home_tab_0", R.layout.cell_hub_card, "layout/cell_hub_card_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_hub_tab, hashMap, "layout/cell_hub_tab_0", R.layout.cell_input_amount, "layout/cell_input_amount_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_input_text, hashMap, "layout/cell_input_text_0", R.layout.cell_invoices_last, "layout/cell_invoices_last_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_invoices_middle, hashMap, "layout/cell_invoices_middle_0", R.layout.cell_invoices_tab, "layout/cell_invoices_tab_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_invoices_top, hashMap, "layout/cell_invoices_top_0", R.layout.cell_key_value, "layout/cell_key_value_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_loan_bottom, hashMap, "layout/cell_loan_bottom_0", R.layout.cell_loan_header, "layout/cell_loan_header_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_loan_history, hashMap, "layout/cell_loan_history_0", R.layout.cell_loan_main, "layout/cell_loan_main_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_loans_tab, hashMap, "layout/cell_loans_tab_0", R.layout.cell_logout_button, "layout/cell_logout_button_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_new_account_type, hashMap, "layout/cell_new_account_type_0", R.layout.cell_new_card_item, "layout/cell_new_card_item_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_new_crypto_address, hashMap, "layout/cell_new_crypto_address_0", R.layout.cell_new_payment_small, "layout/cell_new_payment_small_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_new_payments_tab, hashMap, "layout/cell_new_payments_tab_0", R.layout.cell_pay_from_account, "layout/cell_pay_from_account_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_payment, hashMap, "layout/cell_payment_0", R.layout.cell_payment_details_header, "layout/cell_payment_details_header_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_payment_saved, hashMap, "layout/cell_payment_saved_0", R.layout.cell_payments_tab, "layout/cell_payments_tab_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_personal_data, hashMap, "layout/cell_personal_data_0", R.layout.cell_plan_carousel_item, "layout/cell_plan_carousel_item_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_plan_data, hashMap, "layout/cell_plan_data_0", R.layout.cell_selector, "layout/cell_selector_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_selector_crypto_account, hashMap, "layout/cell_selector_crypto_account_0", R.layout.cell_settings, "layout/cell_settings_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_settings_account, hashMap, "layout/cell_settings_account_0", R.layout.cell_settings_account_business, "layout/cell_settings_account_business_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_settings_tab, hashMap, "layout/cell_settings_tab_0", R.layout.cell_statements_selector, "layout/cell_statements_selector_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_statements_selector_account, hashMap, "layout/cell_statements_selector_account_0", R.layout.cell_statements_selector_account_with_currency, "layout/cell_statements_selector_account_with_currency_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_statements_selector_card, hashMap, "layout/cell_statements_selector_card_0", R.layout.cell_statements_selector_empty, "layout/cell_statements_selector_empty_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_support_item, hashMap, "layout/cell_support_item_0", R.layout.cell_transaction, "layout/cell_transaction_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_transaction_header, hashMap, "layout/cell_transaction_header_0", R.layout.cell_transaction_last, "layout/cell_transaction_last_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_transaction_middle, hashMap, "layout/cell_transaction_middle_0", R.layout.cell_transaction_top, "layout/cell_transaction_top_0");
            androidx.camera.core.impl.utils.a.s(R.layout.cell_transfer_account, hashMap, "layout/cell_transfer_account_0", R.layout.cell_wallet_header, "layout/cell_wallet_header_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_crypto_filter, hashMap, "layout/dialog_crypto_filter_0", R.layout.dialog_filter, "layout/dialog_filter_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_filter_saved, hashMap, "layout/dialog_filter_saved_0", R.layout.dialog_input_text, "layout/dialog_input_text_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_invoice, hashMap, "layout/dialog_invoice_0", R.layout.dialog_passcode, "layout/dialog_passcode_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_qr, hashMap, "layout/dialog_qr_0", R.layout.dialog_rates, "layout/dialog_rates_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_sort, hashMap, "layout/dialog_sort_0", R.layout.dialog_sort_saved, "layout/dialog_sort_saved_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_sort_statistics, hashMap, "layout/dialog_sort_statistics_0", R.layout.dialog_statements_selector, "layout/dialog_statements_selector_0");
            androidx.camera.core.impl.utils.a.s(R.layout.dialog_timer, hashMap, "layout/dialog_timer_0", R.layout.dialog_version, "layout/dialog_version_0");
            androidx.camera.core.impl.utils.a.s(R.layout.edit_2fa_dialog, hashMap, "layout/edit_2fa_dialog_0", R.layout.fragment_account_cards, "layout/fragment_account_cards_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_account_data, hashMap, "layout/fragment_account_data_0", R.layout.fragment_account_details, "layout/fragment_account_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_account_information, hashMap, "layout/fragment_account_information_0", R.layout.fragment_account_transactions, "layout/fragment_account_transactions_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_add_bank, hashMap, "layout/fragment_add_bank_0", R.layout.fragment_add_ubo, "layout/fragment_add_ubo_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_all_transactions, hashMap, "layout/fragment_all_transactions_0", R.layout.fragment_business_activity, "layout/fragment_business_activity_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_buy_crypto_external_details, hashMap, "layout/fragment_buy_crypto_external_details_0", R.layout.fragment_card, "layout/fragment_card_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_card_details, hashMap, "layout/fragment_card_details_0", R.layout.fragment_card_limits, "layout/fragment_card_limits_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_card_security_varification, hashMap, "layout/fragment_card_security_varification_0", R.layout.fragment_card_transaction_details, "layout/fragment_card_transaction_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_cards, hashMap, "layout/fragment_cards_0", R.layout.fragment_change_limit, "layout/fragment_change_limit_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_company_list, hashMap, "layout/fragment_company_list_0", R.layout.fragment_company_not_approved, "layout/fragment_company_not_approved_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_company_under_review, hashMap, "layout/fragment_company_under_review_0", R.layout.fragment_confirm_order, "layout/fragment_confirm_order_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_confirm_topup, hashMap, "layout/fragment_confirm_topup_0", R.layout.fragment_country, "layout/fragment_country_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_create_account, hashMap, "layout/fragment_create_account_0", R.layout.fragment_create_exchange_details, "layout/fragment_create_exchange_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_create_new_account, hashMap, "layout/fragment_create_new_account_0", R.layout.fragment_create_new_account_success, "layout/fragment_create_new_account_success_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_create_new_card_vault, hashMap, "layout/fragment_create_new_card_vault_0", R.layout.fragment_create_new_virtual_card, "layout/fragment_create_new_virtual_card_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_crypto_account_details, hashMap, "layout/fragment_crypto_account_details_0", R.layout.fragment_crypto_exchange, "layout/fragment_crypto_exchange_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_crypto_exchange_details, hashMap, "layout/fragment_crypto_exchange_details_0", R.layout.fragment_crypto_list, "layout/fragment_crypto_list_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_deposit_crypto, hashMap, "layout/fragment_deposit_crypto_0", R.layout.fragment_deposit_crypto_details, "layout/fragment_deposit_crypto_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_edit_account, hashMap, "layout/fragment_edit_account_0", R.layout.fragment_exchange, "layout/fragment_exchange_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_exchanges, hashMap, "layout/fragment_exchanges_0", R.layout.fragment_fee_details, "layout/fragment_fee_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_forgot_password, hashMap, "layout/fragment_forgot_password_0", R.layout.fragment_forgot_password_email_code, "layout/fragment_forgot_password_email_code_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_home, hashMap, "layout/fragment_home_0", R.layout.fragment_hub, "layout/fragment_hub_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_invoice_details, hashMap, "layout/fragment_invoice_details_0", R.layout.fragment_invoices_date, "layout/fragment_invoices_date_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_kyc, hashMap, "layout/fragment_kyc_0", R.layout.fragment_loans, "layout/fragment_loans_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_loans_apply, hashMap, "layout/fragment_loans_apply_0", R.layout.fragment_loans_history, "layout/fragment_loans_history_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_loans_status, hashMap, "layout/fragment_loans_status_0", R.layout.fragment_login, "layout/fragment_login_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_my_companies, hashMap, "layout/fragment_my_companies_0", R.layout.fragment_new_card_list, "layout/fragment_new_card_list_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_additional_information, hashMap, "layout/fragment_new_company_additional_information_0", R.layout.fragment_new_company_confirm_company_address, "layout/fragment_new_company_confirm_company_address_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_crypto_info, hashMap, "layout/fragment_new_company_crypto_info_0", R.layout.fragment_new_company_input_address, "layout/fragment_new_company_input_address_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_posistion_in_company, hashMap, "layout/fragment_new_company_posistion_in_company_0", R.layout.fragment_new_company_select_company, "layout/fragment_new_company_select_company_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_select_country, hashMap, "layout/fragment_new_company_select_country_0", R.layout.fragment_new_company_submit, "layout/fragment_new_company_submit_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_team_members, hashMap, "layout/fragment_new_company_team_members_0", R.layout.fragment_new_company_upload_additional_document, "layout/fragment_new_company_upload_additional_document_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_company_upload_document, hashMap, "layout/fragment_new_company_upload_document_0", R.layout.fragment_new_home, "layout/fragment_new_home_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_invoices, hashMap, "layout/fragment_new_invoices_0", R.layout.fragment_new_payment, "layout/fragment_new_payment_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_payment_bank, hashMap, "layout/fragment_new_payment_bank_0", R.layout.fragment_new_payment_bank_email, "layout/fragment_new_payment_bank_email_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_payment_details, hashMap, "layout/fragment_new_payment_details_0", R.layout.fragment_new_payment_european, "layout/fragment_new_payment_european_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_payment_swift, hashMap, "layout/fragment_new_payment_swift_0", R.layout.fragment_new_payment_swift_bank_info, "layout/fragment_new_payment_swift_bank_info_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_payment_to_bank_account, hashMap, "layout/fragment_new_payment_to_bank_account_0", R.layout.fragment_new_payment_to_bank_account_bank_info, "layout/fragment_new_payment_to_bank_account_bank_info_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_new_payment_uk, hashMap, "layout/fragment_new_payment_uk_0", R.layout.fragment_order_success, "layout/fragment_order_success_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_outgoing_payments, hashMap, "layout/fragment_outgoing_payments_0", R.layout.fragment_pass_code, "layout/fragment_pass_code_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_payments, hashMap, "layout/fragment_payments_0", R.layout.fragment_register, "layout/fragment_register_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_register_address, hashMap, "layout/fragment_register_address_0", R.layout.fragment_register_success, "layout/fragment_register_success_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_rename_card, hashMap, "layout/fragment_rename_card_0", R.layout.fragment_reset_password, "layout/fragment_reset_password_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_select_account_small, hashMap, "layout/fragment_select_account_small_0", R.layout.fragment_select_card_type, "layout/fragment_select_card_type_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_select_plans, hashMap, "layout/fragment_select_plans_0", R.layout.fragment_sell_crypto_external_info, "layout/fragment_sell_crypto_external_info_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_sell_external_account_select, hashMap, "layout/fragment_sell_external_account_select_0", R.layout.fragment_server_error, "layout/fragment_server_error_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_settings, hashMap, "layout/fragment_settings_0", R.layout.fragment_settings_business, "layout/fragment_settings_business_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_settings_more, hashMap, "layout/fragment_settings_more_0", R.layout.fragment_settings_personal, "layout/fragment_settings_personal_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_signer_init, hashMap, "layout/fragment_signer_init_0", R.layout.fragment_signer_list, "layout/fragment_signer_list_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_statements_date, hashMap, "layout/fragment_statements_date_0", R.layout.fragment_statistics, "layout/fragment_statistics_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_status, hashMap, "layout/fragment_status_0", R.layout.fragment_sumsub_inreview, "layout/fragment_sumsub_inreview_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_support, hashMap, "layout/fragment_support_0", R.layout.fragment_tfa_check, "layout/fragment_tfa_check_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_timer, hashMap, "layout/fragment_timer_0", R.layout.fragment_transaction_details, "layout/fragment_transaction_details_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_transfer, hashMap, "layout/fragment_transfer_0", R.layout.fragment_user_blocked, "layout/fragment_user_blocked_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_validation, hashMap, "layout/fragment_validation_0", R.layout.fragment_vault_topup, "layout/fragment_vault_topup_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_verify_address, hashMap, "layout/fragment_verify_address_0", R.layout.fragment_verify_transaction, "layout/fragment_verify_transaction_0");
            androidx.camera.core.impl.utils.a.s(R.layout.fragment_welcome, hashMap, "layout/fragment_welcome_0", R.layout.fragment_withdraw_crypto, "layout/fragment_withdraw_crypto_0");
            androidx.camera.core.impl.utils.a.s(R.layout.item_document, hashMap, "layout/item_document_0", R.layout.item_line_statistic, "layout/item_line_statistic_0");
            androidx.camera.core.impl.utils.a.s(R.layout.layout_icon_exchange, hashMap, "layout/layout_icon_exchange_0", R.layout.loading_dialog, "layout/loading_dialog_0");
            androidx.camera.core.impl.utils.a.s(R.layout.selector_dialog, hashMap, "layout/selector_dialog_0", R.layout.statistic_view, "layout/statistic_view_0");
            androidx.camera.core.impl.utils.a.s(R.layout.view_icon_selector, hashMap, "layout/view_icon_selector_0", R.layout.view_toolbar_content, "layout/view_toolbar_content_0");
            hashMap.put("layout/view_toolbar_test_0", Integer.valueOf(R.layout.view_toolbar_test));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(231);
        f11161a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_error, 1);
        sparseIntArray.put(R.layout.activity_main, 2);
        sparseIntArray.put(R.layout.activity_passcode, 3);
        sparseIntArray.put(R.layout.activity_splash, 4);
        sparseIntArray.put(R.layout.base_bottom_sheet, 5);
        sparseIntArray.put(R.layout.bottom_dialog, 6);
        sparseIntArray.put(R.layout.button_small, 7);
        sparseIntArray.put(R.layout.cell_account, 8);
        sparseIntArray.put(R.layout.cell_account_carousel, 9);
        sparseIntArray.put(R.layout.cell_account_crypto_carousel, 10);
        sparseIntArray.put(R.layout.cell_account_crypto_details_top, 11);
        sparseIntArray.put(R.layout.cell_account_details_top, 12);
        sparseIntArray.put(R.layout.cell_account_horisontal, 13);
        sparseIntArray.put(R.layout.cell_account_horisontal_old, 14);
        sparseIntArray.put(R.layout.cell_account_tab, 15);
        sparseIntArray.put(R.layout.cell_accounts_details_bank_middle, 16);
        sparseIntArray.put(R.layout.cell_accounts_details_middle, 17);
        sparseIntArray.put(R.layout.cell_bank_acoount, 18);
        sparseIntArray.put(R.layout.cell_business_profile, 19);
        sparseIntArray.put(R.layout.cell_card_carousel_item, 20);
        sparseIntArray.put(R.layout.cell_card_details, 21);
        sparseIntArray.put(R.layout.cell_card_small, 22);
        sparseIntArray.put(R.layout.cell_card_vault, 23);
        sparseIntArray.put(R.layout.cell_cards_tab, 24);
        sparseIntArray.put(R.layout.cell_cardtransaction_middle, 25);
        sparseIntArray.put(R.layout.cell_company, 26);
        sparseIntArray.put(R.layout.cell_company_header_new, 27);
        sparseIntArray.put(R.layout.cell_company_new, 28);
        sparseIntArray.put(R.layout.cell_country, 29);
        sparseIntArray.put(R.layout.cell_create_company, 30);
        sparseIntArray.put(R.layout.cell_crypto_account_tab, 31);
        sparseIntArray.put(R.layout.cell_crypto_tab, 32);
        sparseIntArray.put(R.layout.cell_crypto_wallet, 33);
        sparseIntArray.put(R.layout.cell_data_1, 34);
        sparseIntArray.put(R.layout.cell_data_2, 35);
        sparseIntArray.put(R.layout.cell_end_space, 36);
        sparseIntArray.put(R.layout.cell_excahnge_account, 37);
        sparseIntArray.put(R.layout.cell_excahnge_account_header, 38);
        sparseIntArray.put(R.layout.cell_exchange_crypto_action_required_item, 39);
        sparseIntArray.put(R.layout.cell_exchange_crypto_new_item, 40);
        sparseIntArray.put(R.layout.cell_exchange_middle, 41);
        sparseIntArray.put(R.layout.cell_exchanges_tab, 42);
        sparseIntArray.put(R.layout.cell_header, 43);
        sparseIntArray.put(R.layout.cell_header_16_top, 44);
        sparseIntArray.put(R.layout.cell_header_top, 45);
        sparseIntArray.put(R.layout.cell_header_top_blue, 46);
        sparseIntArray.put(R.layout.cell_home_tab, 47);
        sparseIntArray.put(R.layout.cell_hub_card, 48);
        sparseIntArray.put(R.layout.cell_hub_tab, 49);
        sparseIntArray.put(R.layout.cell_input_amount, 50);
        sparseIntArray.put(R.layout.cell_input_text, 51);
        sparseIntArray.put(R.layout.cell_invoices_last, 52);
        sparseIntArray.put(R.layout.cell_invoices_middle, 53);
        sparseIntArray.put(R.layout.cell_invoices_tab, 54);
        sparseIntArray.put(R.layout.cell_invoices_top, 55);
        sparseIntArray.put(R.layout.cell_key_value, 56);
        sparseIntArray.put(R.layout.cell_loan_bottom, 57);
        sparseIntArray.put(R.layout.cell_loan_header, 58);
        sparseIntArray.put(R.layout.cell_loan_history, 59);
        sparseIntArray.put(R.layout.cell_loan_main, 60);
        sparseIntArray.put(R.layout.cell_loans_tab, 61);
        sparseIntArray.put(R.layout.cell_logout_button, 62);
        sparseIntArray.put(R.layout.cell_new_account_type, 63);
        sparseIntArray.put(R.layout.cell_new_card_item, 64);
        sparseIntArray.put(R.layout.cell_new_crypto_address, 65);
        sparseIntArray.put(R.layout.cell_new_payment_small, 66);
        sparseIntArray.put(R.layout.cell_new_payments_tab, 67);
        sparseIntArray.put(R.layout.cell_pay_from_account, 68);
        sparseIntArray.put(R.layout.cell_payment, 69);
        sparseIntArray.put(R.layout.cell_payment_details_header, 70);
        sparseIntArray.put(R.layout.cell_payment_saved, 71);
        sparseIntArray.put(R.layout.cell_payments_tab, 72);
        sparseIntArray.put(R.layout.cell_personal_data, 73);
        sparseIntArray.put(R.layout.cell_plan_carousel_item, 74);
        sparseIntArray.put(R.layout.cell_plan_data, 75);
        sparseIntArray.put(R.layout.cell_selector, 76);
        sparseIntArray.put(R.layout.cell_selector_crypto_account, 77);
        sparseIntArray.put(R.layout.cell_settings, 78);
        sparseIntArray.put(R.layout.cell_settings_account, 79);
        sparseIntArray.put(R.layout.cell_settings_account_business, 80);
        sparseIntArray.put(R.layout.cell_settings_tab, 81);
        sparseIntArray.put(R.layout.cell_statements_selector, 82);
        sparseIntArray.put(R.layout.cell_statements_selector_account, 83);
        sparseIntArray.put(R.layout.cell_statements_selector_account_with_currency, 84);
        sparseIntArray.put(R.layout.cell_statements_selector_card, 85);
        sparseIntArray.put(R.layout.cell_statements_selector_empty, 86);
        sparseIntArray.put(R.layout.cell_support_item, 87);
        sparseIntArray.put(R.layout.cell_transaction, 88);
        sparseIntArray.put(R.layout.cell_transaction_header, 89);
        sparseIntArray.put(R.layout.cell_transaction_last, 90);
        sparseIntArray.put(R.layout.cell_transaction_middle, 91);
        sparseIntArray.put(R.layout.cell_transaction_top, 92);
        sparseIntArray.put(R.layout.cell_transfer_account, 93);
        sparseIntArray.put(R.layout.cell_wallet_header, 94);
        sparseIntArray.put(R.layout.dialog_crypto_filter, 95);
        sparseIntArray.put(R.layout.dialog_filter, 96);
        sparseIntArray.put(R.layout.dialog_filter_saved, 97);
        sparseIntArray.put(R.layout.dialog_input_text, 98);
        sparseIntArray.put(R.layout.dialog_invoice, 99);
        sparseIntArray.put(R.layout.dialog_passcode, 100);
        sparseIntArray.put(R.layout.dialog_qr, 101);
        sparseIntArray.put(R.layout.dialog_rates, 102);
        sparseIntArray.put(R.layout.dialog_sort, 103);
        sparseIntArray.put(R.layout.dialog_sort_saved, 104);
        sparseIntArray.put(R.layout.dialog_sort_statistics, 105);
        sparseIntArray.put(R.layout.dialog_statements_selector, 106);
        sparseIntArray.put(R.layout.dialog_timer, 107);
        sparseIntArray.put(R.layout.dialog_version, 108);
        sparseIntArray.put(R.layout.edit_2fa_dialog, 109);
        sparseIntArray.put(R.layout.fragment_account_cards, 110);
        sparseIntArray.put(R.layout.fragment_account_data, 111);
        sparseIntArray.put(R.layout.fragment_account_details, 112);
        sparseIntArray.put(R.layout.fragment_account_information, 113);
        sparseIntArray.put(R.layout.fragment_account_transactions, 114);
        sparseIntArray.put(R.layout.fragment_add_bank, 115);
        sparseIntArray.put(R.layout.fragment_add_ubo, 116);
        sparseIntArray.put(R.layout.fragment_all_transactions, 117);
        sparseIntArray.put(R.layout.fragment_business_activity, 118);
        sparseIntArray.put(R.layout.fragment_buy_crypto_external_details, 119);
        sparseIntArray.put(R.layout.fragment_card, 120);
        sparseIntArray.put(R.layout.fragment_card_details, 121);
        sparseIntArray.put(R.layout.fragment_card_limits, 122);
        sparseIntArray.put(R.layout.fragment_card_security_varification, 123);
        sparseIntArray.put(R.layout.fragment_card_transaction_details, 124);
        sparseIntArray.put(R.layout.fragment_cards, 125);
        sparseIntArray.put(R.layout.fragment_change_limit, 126);
        sparseIntArray.put(R.layout.fragment_company_list, 127);
        sparseIntArray.put(R.layout.fragment_company_not_approved, 128);
        sparseIntArray.put(R.layout.fragment_company_under_review, 129);
        sparseIntArray.put(R.layout.fragment_confirm_order, 130);
        sparseIntArray.put(R.layout.fragment_confirm_topup, 131);
        sparseIntArray.put(R.layout.fragment_country, 132);
        sparseIntArray.put(R.layout.fragment_create_account, 133);
        sparseIntArray.put(R.layout.fragment_create_exchange_details, 134);
        sparseIntArray.put(R.layout.fragment_create_new_account, 135);
        sparseIntArray.put(R.layout.fragment_create_new_account_success, 136);
        sparseIntArray.put(R.layout.fragment_create_new_card_vault, 137);
        sparseIntArray.put(R.layout.fragment_create_new_virtual_card, 138);
        sparseIntArray.put(R.layout.fragment_crypto_account_details, 139);
        sparseIntArray.put(R.layout.fragment_crypto_exchange, 140);
        sparseIntArray.put(R.layout.fragment_crypto_exchange_details, 141);
        sparseIntArray.put(R.layout.fragment_crypto_list, 142);
        sparseIntArray.put(R.layout.fragment_deposit_crypto, 143);
        sparseIntArray.put(R.layout.fragment_deposit_crypto_details, 144);
        sparseIntArray.put(R.layout.fragment_edit_account, 145);
        sparseIntArray.put(R.layout.fragment_exchange, 146);
        sparseIntArray.put(R.layout.fragment_exchanges, 147);
        sparseIntArray.put(R.layout.fragment_fee_details, 148);
        sparseIntArray.put(R.layout.fragment_forgot_password, 149);
        sparseIntArray.put(R.layout.fragment_forgot_password_email_code, 150);
        sparseIntArray.put(R.layout.fragment_home, 151);
        sparseIntArray.put(R.layout.fragment_hub, 152);
        sparseIntArray.put(R.layout.fragment_invoice_details, 153);
        sparseIntArray.put(R.layout.fragment_invoices_date, 154);
        sparseIntArray.put(R.layout.fragment_kyc, 155);
        sparseIntArray.put(R.layout.fragment_loans, 156);
        sparseIntArray.put(R.layout.fragment_loans_apply, 157);
        sparseIntArray.put(R.layout.fragment_loans_history, 158);
        sparseIntArray.put(R.layout.fragment_loans_status, 159);
        sparseIntArray.put(R.layout.fragment_login, 160);
        sparseIntArray.put(R.layout.fragment_my_companies, 161);
        sparseIntArray.put(R.layout.fragment_new_card_list, 162);
        sparseIntArray.put(R.layout.fragment_new_company_additional_information, 163);
        sparseIntArray.put(R.layout.fragment_new_company_confirm_company_address, 164);
        sparseIntArray.put(R.layout.fragment_new_company_crypto_info, 165);
        sparseIntArray.put(R.layout.fragment_new_company_input_address, 166);
        sparseIntArray.put(R.layout.fragment_new_company_posistion_in_company, 167);
        sparseIntArray.put(R.layout.fragment_new_company_select_company, 168);
        sparseIntArray.put(R.layout.fragment_new_company_select_country, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(R.layout.fragment_new_company_submit, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(R.layout.fragment_new_company_team_members, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(R.layout.fragment_new_company_upload_additional_document, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        sparseIntArray.put(R.layout.fragment_new_company_upload_document, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        sparseIntArray.put(R.layout.fragment_new_home, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_new_invoices, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(R.layout.fragment_new_payment, CipherSuite.TLS_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(R.layout.fragment_new_payment_bank, CipherSuite.TLS_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(R.layout.fragment_new_payment_bank_email, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_new_payment_details, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(R.layout.fragment_new_payment_european, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(R.layout.fragment_new_payment_swift, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(R.layout.fragment_new_payment_swift_bank_info, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_new_payment_to_bank_account, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384);
        sparseIntArray.put(R.layout.fragment_new_payment_to_bank_account_bank_info, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(R.layout.fragment_new_payment_uk, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384);
        sparseIntArray.put(R.layout.fragment_order_success, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_outgoing_payments, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_pass_code, 188);
        sparseIntArray.put(R.layout.fragment_payments, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_register, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_register_address, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_register_success, 192);
        sparseIntArray.put(R.layout.fragment_rename_card, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_reset_password, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_select_account_small, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_select_card_type, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_select_plans, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256);
        sparseIntArray.put(R.layout.fragment_sell_crypto_external_info, 198);
        sparseIntArray.put(R.layout.fragment_sell_external_account_select, 199);
        sparseIntArray.put(R.layout.fragment_server_error, 200);
        sparseIntArray.put(R.layout.fragment_settings, 201);
        sparseIntArray.put(R.layout.fragment_settings_business, 202);
        sparseIntArray.put(R.layout.fragment_settings_more, 203);
        sparseIntArray.put(R.layout.fragment_settings_personal, 204);
        sparseIntArray.put(R.layout.fragment_signer_init, 205);
        sparseIntArray.put(R.layout.fragment_signer_list, 206);
        sparseIntArray.put(R.layout.fragment_statements_date, 207);
        sparseIntArray.put(R.layout.fragment_statistics, 208);
        sparseIntArray.put(R.layout.fragment_status, 209);
        sparseIntArray.put(R.layout.fragment_sumsub_inreview, 210);
        sparseIntArray.put(R.layout.fragment_support, Primes.SMALL_FACTOR_LIMIT);
        sparseIntArray.put(R.layout.fragment_tfa_check, 212);
        sparseIntArray.put(R.layout.fragment_timer, 213);
        sparseIntArray.put(R.layout.fragment_transaction_details, 214);
        sparseIntArray.put(R.layout.fragment_transfer, 215);
        sparseIntArray.put(R.layout.fragment_user_blocked, 216);
        sparseIntArray.put(R.layout.fragment_validation, 217);
        sparseIntArray.put(R.layout.fragment_vault_topup, 218);
        sparseIntArray.put(R.layout.fragment_verify_address, 219);
        sparseIntArray.put(R.layout.fragment_verify_transaction, 220);
        sparseIntArray.put(R.layout.fragment_welcome, 221);
        sparseIntArray.put(R.layout.fragment_withdraw_crypto, 222);
        sparseIntArray.put(R.layout.item_document, PassportService.DEFAULT_MAX_BLOCKSIZE);
        sparseIntArray.put(R.layout.item_line_statistic, BERTags.FLAGS);
        sparseIntArray.put(R.layout.layout_icon_exchange, 225);
        sparseIntArray.put(R.layout.loading_dialog, 226);
        sparseIntArray.put(R.layout.selector_dialog, 227);
        sparseIntArray.put(R.layout.statistic_view, 228);
        sparseIntArray.put(R.layout.view_icon_selector, 229);
        sparseIntArray.put(R.layout.view_toolbar_content, 230);
        sparseIntArray.put(R.layout.view_toolbar_test, 231);
    }

    public static f a(c cVar, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_error_0".equals(obj)) {
                    return new C1288a(cVar, view, 0);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for activity_error is invalid. Received: "));
            case 2:
                if ("layout/activity_main_0".equals(obj)) {
                    return new C1304c(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for activity_main is invalid. Received: "));
            case 3:
                if ("layout/activity_passcode_0".equals(obj)) {
                    return new C1320e(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for activity_passcode is invalid. Received: "));
            case 4:
                if ("layout/activity_splash_0".equals(obj)) {
                    return new C1288a(cVar, view, 1);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for activity_splash is invalid. Received: "));
            case 5:
                if ("layout/base_bottom_sheet_0".equals(obj)) {
                    return new C1336g(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for base_bottom_sheet is invalid. Received: "));
            case 6:
                if ("layout/bottom_dialog_0".equals(obj)) {
                    return new C1352i(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for bottom_dialog is invalid. Received: "));
            case 7:
                if (!"layout/button_small_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for button_small is invalid. Received: "));
                }
                Object[] h9 = f.h(view, 4, C1368k.f29161t);
                C1368k c1368k = new C1368k(cVar, view, (ConstraintLayout) h9[0], (ImageView) h9[1], (ImageView) h9[2], (TextView) h9[3]);
                c1368k.f29162s = -1L;
                c1368k.f29111n.setTag(null);
                c1368k.l(view);
                synchronized (c1368k) {
                    c1368k.f29162s = 1L;
                }
                c1368k.i();
                return c1368k;
            case 8:
                if ("layout/cell_account_0".equals(obj)) {
                    return new C1384m(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account is invalid. Received: "));
            case 9:
                if ("layout/cell_account_carousel_0".equals(obj)) {
                    return new C1392n(cVar, view, 0);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_carousel is invalid. Received: "));
            case 10:
                if ("layout/cell_account_crypto_carousel_0".equals(obj)) {
                    return new C1392n(cVar, view, 1);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_crypto_carousel is invalid. Received: "));
            case 11:
                if (!"layout/cell_account_crypto_details_top_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_crypto_details_top is invalid. Received: "));
                }
                Object[] h10 = f.h(view, 10, C1408p.f29438F);
                ButtonSmall buttonSmall = (ButtonSmall) h10[6];
                ShapeableImageView shapeableImageView = (ShapeableImageView) h10[1];
                ButtonSmall buttonSmall2 = (ButtonSmall) h10[4];
                ButtonSmall buttonSmall3 = (ButtonSmall) h10[5];
                ConstraintLayout constraintLayout = (ConstraintLayout) h10[0];
                TextView textView = (TextView) h10[3];
                TextView textView2 = (TextView) h10[2];
                C1408p c1408p = new C1408p(cVar, view, buttonSmall, shapeableImageView, buttonSmall2, buttonSmall3, constraintLayout, textView, textView2, (ButtonSmall) h10[8], (ButtonSmall) h10[7]);
                c1408p.f29439E = -1L;
                c1408p.f29377n.setTag(null);
                c1408p.f29378o.setTag(null);
                c1408p.f29379p.setTag(null);
                c1408p.f29380q.setTag(null);
                c1408p.f29381r.setTag(null);
                c1408p.f29382s.setTag(null);
                c1408p.f29383t.setTag(null);
                c1408p.f29384u.setTag(null);
                c1408p.f29385v.setTag(null);
                c1408p.l(view);
                synchronized (c1408p) {
                    c1408p.f29439E = 2048L;
                }
                c1408p.i();
                return c1408p;
            case 12:
                if ("layout/cell_account_details_top_0".equals(obj)) {
                    return new r(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_details_top is invalid. Received: "));
            case 13:
                if ("layout/cell_account_horisontal_0".equals(obj)) {
                    return new C1438t(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_horisontal is invalid. Received: "));
            case 14:
                if ("layout/cell_account_horisontal_old_0".equals(obj)) {
                    return new C1452v(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_horisontal_old is invalid. Received: "));
            case 15:
                if ("layout/cell_account_tab_0".equals(obj)) {
                    return new C1466x(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_account_tab is invalid. Received: "));
            case 16:
                if ("layout/cell_accounts_details_bank_middle_0".equals(obj)) {
                    return new C1480z(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_accounts_details_bank_middle is invalid. Received: "));
            case 17:
                if ("layout/cell_accounts_details_middle_0".equals(obj)) {
                    return new C1282B(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_accounts_details_middle is invalid. Received: "));
            case 18:
                if ("layout/cell_bank_acoount_0".equals(obj)) {
                    return new C1283C(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_bank_acoount is invalid. Received: "));
            case 19:
                if ("layout/cell_business_profile_0".equals(obj)) {
                    return new C1285E(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_business_profile is invalid. Received: "));
            case 20:
                if ("layout/cell_card_carousel_item_0".equals(obj)) {
                    return new C1392n(cVar, view, 2);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_card_carousel_item is invalid. Received: "));
            case 21:
                if ("layout/cell_card_details_0".equals(obj)) {
                    return new C1287G(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_card_details is invalid. Received: "));
            case 22:
                if ("layout/cell_card_small_0".equals(obj)) {
                    return new I(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_card_small is invalid. Received: "));
            case 23:
                if ("layout/cell_card_vault_0".equals(obj)) {
                    return new K(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_card_vault is invalid. Received: "));
            case 24:
                if ("layout/cell_cards_tab_0".equals(obj)) {
                    return new L(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_cards_tab is invalid. Received: "));
            case 25:
                if ("layout/cell_cardtransaction_middle_0".equals(obj)) {
                    return new N(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_cardtransaction_middle is invalid. Received: "));
            case 26:
                if ("layout/cell_company_0".equals(obj)) {
                    return new P(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_company is invalid. Received: "));
            case 27:
                if (!"layout/cell_company_header_new_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_company_header_new is invalid. Received: "));
                }
                Q q10 = new Q(cVar, view, (TextView) f.h(view, 1, null)[0]);
                q10.f28342o = -1L;
                ((TextView) q10.f28343p).setTag(null);
                q10.l(view);
                synchronized (q10) {
                    q10.f28342o = 4L;
                }
                q10.i();
                return q10;
            case 28:
                if ("layout/cell_company_new_0".equals(obj)) {
                    return new T(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_company_new is invalid. Received: "));
            case 29:
                if ("layout/cell_country_0".equals(obj)) {
                    return new V(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_country is invalid. Received: "));
            case 30:
                if ("layout/cell_create_company_0".equals(obj)) {
                    return new X(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_create_company is invalid. Received: "));
            case 31:
                if ("layout/cell_crypto_account_tab_0".equals(obj)) {
                    return new Y(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_crypto_account_tab is invalid. Received: "));
            case 32:
                if ("layout/cell_crypto_tab_0".equals(obj)) {
                    return new C1288a(cVar, view, 2);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_crypto_tab is invalid. Received: "));
            case 33:
                if ("layout/cell_crypto_wallet_0".equals(obj)) {
                    return new C1289a0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_crypto_wallet is invalid. Received: "));
            case 34:
                if ("layout/cell_data_1_0".equals(obj)) {
                    return new C1305c0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_data_1 is invalid. Received: "));
            case 35:
                if ("layout/cell_data_2_0".equals(obj)) {
                    return new C1321e0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_data_2 is invalid. Received: "));
            case 36:
                if ("layout/cell_end_space_0".equals(obj)) {
                    return new Q(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_end_space is invalid. Received: "));
            case 37:
                if ("layout/cell_excahnge_account_0".equals(obj)) {
                    return new C1337g0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_excahnge_account is invalid. Received: "));
            case 38:
                if ("layout/cell_excahnge_account_header_0".equals(obj)) {
                    return new C1345h0(cVar, view, 0);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_excahnge_account_header is invalid. Received: "));
            case 39:
                if ("layout/cell_exchange_crypto_action_required_item_0".equals(obj)) {
                    return new C1361j0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_exchange_crypto_action_required_item is invalid. Received: "));
            case 40:
                if ("layout/cell_exchange_crypto_new_item_0".equals(obj)) {
                    return new C1377l0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_exchange_crypto_new_item is invalid. Received: "));
            case 41:
                if ("layout/cell_exchange_middle_0".equals(obj)) {
                    return new C1393n0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_exchange_middle is invalid. Received: "));
            case 42:
                if ("layout/cell_exchanges_tab_0".equals(obj)) {
                    return new C1401o0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_exchanges_tab is invalid. Received: "));
            case 43:
                if ("layout/cell_header_0".equals(obj)) {
                    return new C1432s0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_header is invalid. Received: "));
            case 44:
                if ("layout/cell_header_16_top_0".equals(obj)) {
                    return new C1417q0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_header_16_top is invalid. Received: "));
            case 45:
                if ("layout/cell_header_top_0".equals(obj)) {
                    return new C1446u0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_header_top is invalid. Received: "));
            case 46:
                if ("layout/cell_header_top_blue_0".equals(obj)) {
                    return new C1460w0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_header_top_blue is invalid. Received: "));
            case 47:
                if ("layout/cell_home_tab_0".equals(obj)) {
                    return new C1467x0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_home_tab is invalid. Received: "));
            case 48:
                if ("layout/cell_hub_card_0".equals(obj)) {
                    return new C1481z0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_hub_card is invalid. Received: "));
            case 49:
                if ("layout/cell_hub_tab_0".equals(obj)) {
                    return new A0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_hub_tab is invalid. Received: "));
            case 50:
                if (!"layout/cell_input_amount_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for cell_input_amount is invalid. Received: "));
                }
                Object[] h11 = f.h(view, 4, null);
                C0 c02 = new C0(cVar, view, (CustomTextInputLayout) h11[1], (CustomTextInputEditText) h11[2], (TextView) h11[3]);
                c02.f27655x = -1L;
                c02.f27631n.setTag(null);
                c02.f27632o.setTag(null);
                ((ConstraintLayout) h11[0]).setTag(null);
                c02.f27633p.setTag(null);
                c02.l(view);
                synchronized (c02) {
                    c02.f27655x = 16384L;
                }
                c02.i();
                return c02;
            default:
                return null;
        }
    }

    public static f b(c cVar, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/dialog_qr_0".equals(obj)) {
                    return new C1363j2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_qr is invalid. Received: "));
            case 102:
                if ("layout/dialog_rates_0".equals(obj)) {
                    return new C1371k2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_rates is invalid. Received: "));
            case 103:
                if ("layout/dialog_sort_0".equals(obj)) {
                    return new C1387m2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_sort is invalid. Received: "));
            case 104:
                if ("layout/dialog_sort_saved_0".equals(obj)) {
                    return new C1395n2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_sort_saved is invalid. Received: "));
            case 105:
                if ("layout/dialog_sort_statistics_0".equals(obj)) {
                    return new C1411p2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_sort_statistics is invalid. Received: "));
            case 106:
                if ("layout/dialog_statements_selector_0".equals(obj)) {
                    return new C1426r2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_statements_selector is invalid. Received: "));
            case 107:
                if ("layout/dialog_timer_0".equals(obj)) {
                    return new C1441t2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_timer is invalid. Received: "));
            case 108:
                if ("layout/dialog_version_0".equals(obj)) {
                    return new C1455v2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for dialog_version is invalid. Received: "));
            case 109:
                if ("layout/edit_2fa_dialog_0".equals(obj)) {
                    return new C1469x2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for edit_2fa_dialog is invalid. Received: "));
            case 110:
                if ("layout/fragment_account_cards_0".equals(obj)) {
                    return new C1476y2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_account_cards is invalid. Received: "));
            case 111:
                if ("layout/fragment_account_data_0".equals(obj)) {
                    return new C1483z2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_account_data is invalid. Received: "));
            case 112:
                if ("layout/fragment_account_details_0".equals(obj)) {
                    return new B2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_account_details is invalid. Received: "));
            case 113:
                if ("layout/fragment_account_information_0".equals(obj)) {
                    return new D2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_account_information is invalid. Received: "));
            case 114:
                if ("layout/fragment_account_transactions_0".equals(obj)) {
                    return new F2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_account_transactions is invalid. Received: "));
            case 115:
                if ("layout/fragment_add_bank_0".equals(obj)) {
                    return new H2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_add_bank is invalid. Received: "));
            case 116:
                if ("layout/fragment_add_ubo_0".equals(obj)) {
                    return new J2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_add_ubo is invalid. Received: "));
            case 117:
                if ("layout/fragment_all_transactions_0".equals(obj)) {
                    return new L2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_all_transactions is invalid. Received: "));
            case 118:
                if ("layout/fragment_business_activity_0".equals(obj)) {
                    return new N2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_business_activity is invalid. Received: "));
            case 119:
                if ("layout/fragment_buy_crypto_external_details_0".equals(obj)) {
                    return new P2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_buy_crypto_external_details is invalid. Received: "));
            case 120:
                if ("layout/fragment_card_0".equals(obj)) {
                    return new R2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_card is invalid. Received: "));
            case 121:
                if ("layout/fragment_card_details_0".equals(obj)) {
                    return new T2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_card_details is invalid. Received: "));
            case 122:
                if (!"layout/fragment_card_limits_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_card_limits is invalid. Received: "));
                }
                Object[] h9 = f.h(view, 38, V2.f28589J);
                TextView textView = (TextView) h9[3];
                Switch r52 = (Switch) h9[8];
                LinearLayout linearLayout = (LinearLayout) h9[10];
                TextView textView2 = (TextView) h9[11];
                MaterialTextView materialTextView = (MaterialTextView) h9[14];
                LinearLayout linearLayout2 = (LinearLayout) h9[16];
                TextView textView3 = (TextView) h9[17];
                MaterialTextView materialTextView2 = (MaterialTextView) h9[20];
                TextView textView4 = (TextView) h9[2];
                NestedScrollView nestedScrollView = (NestedScrollView) h9[0];
                LinearLayout linearLayout3 = (LinearLayout) h9[27];
                TextView textView5 = (TextView) h9[28];
                MaterialTextView materialTextView3 = (MaterialTextView) h9[31];
                LinearLayout linearLayout4 = (LinearLayout) h9[33];
                TextView textView6 = (TextView) h9[34];
                MaterialTextView materialTextView4 = (MaterialTextView) h9[37];
                Switch r20 = (Switch) h9[25];
                ProgressBar progressBar = (ProgressBar) h9[12];
                ProgressBar progressBar2 = (ProgressBar) h9[18];
                ProgressBar progressBar3 = (ProgressBar) h9[29];
                ProgressBar progressBar4 = (ProgressBar) h9[35];
                V2 v22 = new V2(cVar, view, textView, r52, linearLayout, textView2, materialTextView, linearLayout2, textView3, materialTextView2, textView4, nestedScrollView, linearLayout3, textView5, materialTextView3, linearLayout4, textView6, materialTextView4, r20, progressBar, progressBar2, progressBar3, progressBar4);
                v22.f28590I = -1L;
                v22.f28563w.setTag(null);
                v22.l(view);
                synchronized (v22) {
                    v22.f28590I = 1L;
                }
                v22.i();
                return v22;
            case 123:
                if ("layout/fragment_card_security_varification_0".equals(obj)) {
                    return new X2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_card_security_varification is invalid. Received: "));
            case 124:
                if ("layout/fragment_card_transaction_details_0".equals(obj)) {
                    return new Z2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_card_transaction_details is invalid. Received: "));
            case 125:
                if (!"layout/fragment_cards_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_cards is invalid. Received: "));
                }
                Object[] h10 = f.h(view, 6, C1300b3.f28818s);
                Button button = (Button) h10[5];
                ConstraintLayout constraintLayout = (ConstraintLayout) h10[2];
                C1300b3 c1300b3 = new C1300b3(cVar, view, button, constraintLayout, (EpoxyRecyclerView) h10[1], (SwipeRefreshLayout) h10[0]);
                c1300b3.f28819r = -1L;
                c1300b3.f28793q.setTag(null);
                c1300b3.l(view);
                synchronized (c1300b3) {
                    c1300b3.f28819r = 1L;
                }
                c1300b3.i();
                return c1300b3;
            case 126:
                if ("layout/fragment_change_limit_0".equals(obj)) {
                    return new C1316d3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_change_limit is invalid. Received: "));
            case 127:
                if (!"layout/fragment_company_list_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_company_list is invalid. Received: "));
                }
                Object[] h11 = f.h(view, 6, C1332f3.f28993u);
                C1332f3 c1332f3 = new C1332f3(cVar, view, (Button) h11[5], (Button) h11[4], (EpoxyRecyclerView) h11[1], (TextView) h11[3], (SwipeRefreshLayout) h11[0], (TextView) h11[2]);
                c1332f3.f28994t = -1L;
                c1332f3.f28957r.setTag(null);
                c1332f3.l(view);
                synchronized (c1332f3) {
                    c1332f3.f28994t = 1L;
                }
                c1332f3.i();
                return c1332f3;
            case 128:
                if ("layout/fragment_company_not_approved_0".equals(obj)) {
                    return new C1348h3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_company_not_approved is invalid. Received: "));
            case 129:
                if ("layout/fragment_company_under_review_0".equals(obj)) {
                    return new C1364j3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_company_under_review is invalid. Received: "));
            case 130:
                if ("layout/fragment_confirm_order_0".equals(obj)) {
                    return new C1380l3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_confirm_order is invalid. Received: "));
            case 131:
                if ("layout/fragment_confirm_topup_0".equals(obj)) {
                    return new C1396n3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_confirm_topup is invalid. Received: "));
            case 132:
                if ("layout/fragment_country_0".equals(obj)) {
                    return new C1412p3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_country is invalid. Received: "));
            case 133:
                if ("layout/fragment_create_account_0".equals(obj)) {
                    return new C1427r3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_account is invalid. Received: "));
            case 134:
                if ("layout/fragment_create_exchange_details_0".equals(obj)) {
                    return new C1442t3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_exchange_details is invalid. Received: "));
            case 135:
                if ("layout/fragment_create_new_account_0".equals(obj)) {
                    return new C1456v3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_new_account is invalid. Received: "));
            case 136:
                if ("layout/fragment_create_new_account_success_0".equals(obj)) {
                    return new C1470x3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_new_account_success is invalid. Received: "));
            case 137:
                if ("layout/fragment_create_new_card_vault_0".equals(obj)) {
                    return new C1484z3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_new_card_vault is invalid. Received: "));
            case 138:
                if ("layout/fragment_create_new_virtual_card_0".equals(obj)) {
                    return new B3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_create_new_virtual_card is invalid. Received: "));
            case 139:
                if ("layout/fragment_crypto_account_details_0".equals(obj)) {
                    return new D3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_crypto_account_details is invalid. Received: "));
            case 140:
                if ("layout/fragment_crypto_exchange_0".equals(obj)) {
                    return new F3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_crypto_exchange is invalid. Received: "));
            case 141:
                if ("layout/fragment_crypto_exchange_details_0".equals(obj)) {
                    return new H3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_crypto_exchange_details is invalid. Received: "));
            case 142:
                if ("layout/fragment_crypto_list_0".equals(obj)) {
                    return new J3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_crypto_list is invalid. Received: "));
            case 143:
                if ("layout/fragment_deposit_crypto_0".equals(obj)) {
                    return new L3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_deposit_crypto is invalid. Received: "));
            case 144:
                if ("layout/fragment_deposit_crypto_details_0".equals(obj)) {
                    return new N3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_deposit_crypto_details is invalid. Received: "));
            case 145:
                if ("layout/fragment_edit_account_0".equals(obj)) {
                    return new P3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_edit_account is invalid. Received: "));
            case 146:
                if ("layout/fragment_exchange_0".equals(obj)) {
                    return new Q3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_exchange is invalid. Received: "));
            case 147:
                if (!"layout/fragment_exchanges_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_exchanges is invalid. Received: "));
                }
                Object[] h12 = f.h(view, 5, S3.f28486s);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) h12[3];
                TextView textView7 = (TextView) h12[4];
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) h12[1];
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h12[0];
                S3 s32 = new S3(cVar, view, constraintLayout2, textView7, epoxyRecyclerView, swipeRefreshLayout);
                s32.f28487r = -1L;
                s32.f28413q.setTag(null);
                s32.l(view);
                synchronized (s32) {
                    s32.f28487r = 1L;
                }
                s32.i();
                return s32;
            case 148:
                if ("layout/fragment_fee_details_0".equals(obj)) {
                    return new U3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_fee_details is invalid. Received: "));
            case 149:
                if ("layout/fragment_forgot_password_0".equals(obj)) {
                    return new W3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_forgot_password is invalid. Received: "));
            case 150:
                if ("layout/fragment_forgot_password_email_code_0".equals(obj)) {
                    return new Y3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_forgot_password_email_code is invalid. Received: "));
            default:
                return null;
        }
    }

    public static f c(c cVar, View view, int i, Object obj) {
        switch (i) {
            case 151:
                if ("layout/fragment_home_0".equals(obj)) {
                    return new Z3(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_home is invalid. Received: "));
            case 152:
                if ("layout/fragment_hub_0".equals(obj)) {
                    return new C1301b4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_hub is invalid. Received: "));
            case 153:
                if ("layout/fragment_invoice_details_0".equals(obj)) {
                    return new C1317d4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_invoice_details is invalid. Received: "));
            case 154:
                if ("layout/fragment_invoices_date_0".equals(obj)) {
                    return new C1333f4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_invoices_date is invalid. Received: "));
            case 155:
                if ("layout/fragment_kyc_0".equals(obj)) {
                    return new C1349h4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_kyc is invalid. Received: "));
            case 156:
                if ("layout/fragment_loans_0".equals(obj)) {
                    return new C1373k4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_loans is invalid. Received: "));
            case 157:
                if ("layout/fragment_loans_apply_0".equals(obj)) {
                    return new C1357i4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_loans_apply is invalid. Received: "));
            case 158:
                if ("layout/fragment_loans_history_0".equals(obj)) {
                    return new C1381l4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_loans_history is invalid. Received: "));
            case 159:
                if ("layout/fragment_loans_status_0".equals(obj)) {
                    return new C1397n4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_loans_status is invalid. Received: "));
            case 160:
                if ("layout/fragment_login_0".equals(obj)) {
                    return new C1413p4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_login is invalid. Received: "));
            case 161:
                if ("layout/fragment_my_companies_0".equals(obj)) {
                    return new C1428r4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_my_companies is invalid. Received: "));
            case 162:
                if ("layout/fragment_new_card_list_0".equals(obj)) {
                    return new C1443t4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_card_list is invalid. Received: "));
            case 163:
                if ("layout/fragment_new_company_additional_information_0".equals(obj)) {
                    return new C1457v4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_additional_information is invalid. Received: "));
            case 164:
                if ("layout/fragment_new_company_confirm_company_address_0".equals(obj)) {
                    return new C1471x4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_confirm_company_address is invalid. Received: "));
            case 165:
                if ("layout/fragment_new_company_crypto_info_0".equals(obj)) {
                    return new C1485z4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_crypto_info is invalid. Received: "));
            case 166:
                if ("layout/fragment_new_company_input_address_0".equals(obj)) {
                    return new B4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_input_address is invalid. Received: "));
            case 167:
                if ("layout/fragment_new_company_posistion_in_company_0".equals(obj)) {
                    return new D4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_posistion_in_company is invalid. Received: "));
            case 168:
                if ("layout/fragment_new_company_select_company_0".equals(obj)) {
                    return new F4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_select_company is invalid. Received: "));
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                if ("layout/fragment_new_company_select_country_0".equals(obj)) {
                    return new H4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_select_country is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                if ("layout/fragment_new_company_submit_0".equals(obj)) {
                    return new J4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_submit is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                if ("layout/fragment_new_company_team_members_0".equals(obj)) {
                    return new L4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_team_members is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                if ("layout/fragment_new_company_upload_additional_document_0".equals(obj)) {
                    return new N4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_upload_additional_document is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                if ("layout/fragment_new_company_upload_document_0".equals(obj)) {
                    return new P4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_company_upload_document is invalid. Received: "));
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                if (!"layout/fragment_new_home_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_home is invalid. Received: "));
                }
                Object[] h9 = f.h(view, 7, R4.f28414v);
                R4 r42 = new R4(cVar, view, (ConstraintLayout) h9[5], (TextView) h9[6], (EpoxyRecyclerView) h9[3], (EpoxyRecyclerView) h9[2], (SwipeRefreshLayout) h9[0], (View) h9[4], (ViewFlipper) h9[1]);
                r42.f28415u = -1L;
                r42.f28396r.setTag(null);
                r42.l(view);
                synchronized (r42) {
                    r42.f28415u = 1L;
                }
                r42.i();
                return r42;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                if (!"layout/fragment_new_invoices_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_invoices is invalid. Received: "));
                }
                Object[] h10 = f.h(view, 5, T4.f28515t);
                T4 t42 = new T4(cVar, view, (ConstraintLayout) h10[3], (TextView) h10[4], (EpoxyRecyclerView) h10[1], (SwipeRefreshLayout) h10[0], (View) h10[2]);
                t42.f28516s = -1L;
                t42.f28491q.setTag(null);
                t42.l(view);
                synchronized (t42) {
                    t42.f28516s = 1L;
                }
                t42.i();
                return t42;
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                if ("layout/fragment_new_payment_0".equals(obj)) {
                    return new Y4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment is invalid. Received: "));
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                if ("layout/fragment_new_payment_bank_0".equals(obj)) {
                    return new V4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_bank is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                if ("layout/fragment_new_payment_bank_email_0".equals(obj)) {
                    return new X4(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_bank_email is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                if ("layout/fragment_new_payment_details_0".equals(obj)) {
                    return new C1294a5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_details is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                if ("layout/fragment_new_payment_european_0".equals(obj)) {
                    return new C1310c5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_european is invalid. Received: "));
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                if ("layout/fragment_new_payment_swift_0".equals(obj)) {
                    return new C1342g5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_swift is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                if ("layout/fragment_new_payment_swift_bank_info_0".equals(obj)) {
                    return new C1326e5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_swift_bank_info is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                if ("layout/fragment_new_payment_to_bank_account_0".equals(obj)) {
                    return new C1374k5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_to_bank_account is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                if ("layout/fragment_new_payment_to_bank_account_bank_info_0".equals(obj)) {
                    return new C1358i5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_to_bank_account_bank_info is invalid. Received: "));
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                if ("layout/fragment_new_payment_uk_0".equals(obj)) {
                    return new C1390m5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_new_payment_uk is invalid. Received: "));
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                if ("layout/fragment_order_success_0".equals(obj)) {
                    return new C1406o5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_order_success is invalid. Received: "));
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                if ("layout/fragment_outgoing_payments_0".equals(obj)) {
                    return new C1422q5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_outgoing_payments is invalid. Received: "));
            case 188:
                if ("layout/fragment_pass_code_0".equals(obj)) {
                    return new C1429r5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_pass_code is invalid. Received: "));
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                if (!"layout/fragment_payments_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_payments is invalid. Received: "));
                }
                Object[] h11 = f.h(view, 5, C1444t5.f29619t);
                C1444t5 c1444t5 = new C1444t5(cVar, view, (ConstraintLayout) h11[3], (TextView) h11[4], (EpoxyRecyclerView) h11[1], (SwipeRefreshLayout) h11[0], (View) h11[2]);
                c1444t5.f29620s = -1L;
                c1444t5.f29591q.setTag(null);
                c1444t5.l(view);
                synchronized (c1444t5) {
                    c1444t5.f29620s = 1L;
                }
                c1444t5.i();
                return c1444t5;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                if ("layout/fragment_register_0".equals(obj)) {
                    return new C1472x5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_register is invalid. Received: "));
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                if ("layout/fragment_register_address_0".equals(obj)) {
                    return new C1458v5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_register_address is invalid. Received: "));
            case 192:
                if ("layout/fragment_register_success_0".equals(obj)) {
                    return new C1486z5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_register_success is invalid. Received: "));
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                if ("layout/fragment_rename_card_0".equals(obj)) {
                    return new B5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_rename_card is invalid. Received: "));
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                if ("layout/fragment_reset_password_0".equals(obj)) {
                    return new D5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_reset_password is invalid. Received: "));
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                if ("layout/fragment_select_account_small_0".equals(obj)) {
                    return new F5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_select_account_small is invalid. Received: "));
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                if ("layout/fragment_select_card_type_0".equals(obj)) {
                    return new H5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_select_card_type is invalid. Received: "));
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                if ("layout/fragment_select_plans_0".equals(obj)) {
                    return new J5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_select_plans is invalid. Received: "));
            case 198:
                if ("layout/fragment_sell_crypto_external_info_0".equals(obj)) {
                    return new L5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_sell_crypto_external_info is invalid. Received: "));
            case 199:
                if ("layout/fragment_sell_external_account_select_0".equals(obj)) {
                    return new N5(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_sell_external_account_select is invalid. Received: "));
            case 200:
                if (!"layout/fragment_server_error_0".equals(obj)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(obj, "The tag for fragment_server_error is invalid. Received: "));
                }
                Object[] h12 = f.h(view, 6, P5.f28323s);
                View view2 = (View) h12[1];
                Button button = (Button) h12[5];
                ImageView imageView = (ImageView) h12[2];
                ConstraintLayout constraintLayout = (ConstraintLayout) h12[0];
                P5 p52 = new P5(cVar, view, view2, button, imageView, constraintLayout);
                p52.f28324r = -1L;
                p52.f28307q.setTag(null);
                p52.l(view);
                synchronized (p52) {
                    p52.f28324r = 1L;
                }
                p52.i();
                return p52;
            default:
                return null;
        }
    }

    @Override // F0.b
    public final List<F0.b> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        arrayList.add(new com.luminary.business.data.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // F0.b
    public final String convertBrIdToString(int i) {
        return a.f11162a.get(i);
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View view, int i) {
        int i9 = f11161a.get(i);
        if (i9 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i10 = (i9 - 1) / 50;
        if (i10 == 0) {
            return a(cVar, view, i9, tag);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return b(cVar, view, i9, tag);
            }
            if (i10 == 3) {
                return c(cVar, view, i9, tag);
            }
            if (i10 != 4) {
                return null;
            }
            switch (i9) {
                case 201:
                    if ("layout/fragment_settings_0".equals(tag)) {
                        return new R5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_settings is invalid. Received: "));
                case 202:
                    if ("layout/fragment_settings_business_0".equals(tag)) {
                        return new S5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_settings_business is invalid. Received: "));
                case 203:
                    if ("layout/fragment_settings_more_0".equals(tag)) {
                        return new T5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_settings_more is invalid. Received: "));
                case 204:
                    if ("layout/fragment_settings_personal_0".equals(tag)) {
                        return new U5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_settings_personal is invalid. Received: "));
                case 205:
                    if ("layout/fragment_signer_init_0".equals(tag)) {
                        return new W5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_signer_init is invalid. Received: "));
                case 206:
                    if ("layout/fragment_signer_list_0".equals(tag)) {
                        return new Y5(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_signer_list is invalid. Received: "));
                case 207:
                    if ("layout/fragment_statements_date_0".equals(tag)) {
                        return new C1295a6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_statements_date is invalid. Received: "));
                case 208:
                    if ("layout/fragment_statistics_0".equals(tag)) {
                        return new C1311c6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_statistics is invalid. Received: "));
                case 209:
                    if ("layout/fragment_status_0".equals(tag)) {
                        return new C1327e6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_status is invalid. Received: "));
                case 210:
                    if ("layout/fragment_sumsub_inreview_0".equals(tag)) {
                        return new C1343g6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_sumsub_inreview is invalid. Received: "));
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                    if ("layout/fragment_support_0".equals(tag)) {
                        return new C1359i6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_support is invalid. Received: "));
                case 212:
                    if (!"layout/fragment_tfa_check_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_tfa_check is invalid. Received: "));
                    }
                    Object[] h9 = f.h(view, 5, C1375k6.f29197t);
                    C1375k6 c1375k6 = new C1375k6(cVar, view, (Button) h9[2], (Button) h9[3], (CodeTextView) h9[1], (ConstraintLayout) h9[0], (Button) h9[4]);
                    c1375k6.f29198s = -1L;
                    c1375k6.f29159q.setTag(null);
                    view.setTag(R.id.dataBinding, c1375k6);
                    synchronized (c1375k6) {
                        c1375k6.f29198s = 1L;
                    }
                    c1375k6.i();
                    return c1375k6;
                case 213:
                    if ("layout/fragment_timer_0".equals(tag)) {
                        return new C1391m6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_timer is invalid. Received: "));
                case 214:
                    if ("layout/fragment_transaction_details_0".equals(tag)) {
                        return new C1407o6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_transaction_details is invalid. Received: "));
                case 215:
                    if ("layout/fragment_transfer_0".equals(tag)) {
                        return new C1423q6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_transfer is invalid. Received: "));
                case 216:
                    if ("layout/fragment_user_blocked_0".equals(tag)) {
                        return new s6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_user_blocked is invalid. Received: "));
                case 217:
                    if ("layout/fragment_validation_0".equals(tag)) {
                        return new u6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_validation is invalid. Received: "));
                case 218:
                    if ("layout/fragment_vault_topup_0".equals(tag)) {
                        return new w6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_vault_topup is invalid. Received: "));
                case 219:
                    if ("layout/fragment_verify_address_0".equals(tag)) {
                        return new y6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_verify_address is invalid. Received: "));
                case 220:
                    if ("layout/fragment_verify_transaction_0".equals(tag)) {
                        return new A6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_verify_transaction is invalid. Received: "));
                case 221:
                    if ("layout/fragment_welcome_0".equals(tag)) {
                        return new C6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_welcome is invalid. Received: "));
                case 222:
                    if ("layout/fragment_withdraw_crypto_0".equals(tag)) {
                        return new E6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for fragment_withdraw_crypto is invalid. Received: "));
                case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                    if ("layout/item_document_0".equals(tag)) {
                        return new F6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for item_document is invalid. Received: "));
                case BERTags.FLAGS /* 224 */:
                    if ("layout/item_line_statistic_0".equals(tag)) {
                        return new G6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for item_line_statistic is invalid. Received: "));
                case 225:
                    if ("layout/layout_icon_exchange_0".equals(tag)) {
                        return new H6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for layout_icon_exchange is invalid. Received: "));
                case 226:
                    if (!"layout/loading_dialog_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for loading_dialog is invalid. Received: "));
                    }
                    J6 j62 = new J6(cVar, view, (ProgressBar) f.h(view, 1, null)[0]);
                    j62.f28034p = -1L;
                    j62.f28015n.setTag(null);
                    view.setTag(R.id.dataBinding, j62);
                    synchronized (j62) {
                        j62.f28034p = 1L;
                    }
                    j62.i();
                    return j62;
                case 227:
                    if ("layout/selector_dialog_0".equals(tag)) {
                        return new L6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for selector_dialog is invalid. Received: "));
                case 228:
                    if (!"layout/statistic_view_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for statistic_view is invalid. Received: "));
                    }
                    N6 n62 = new N6(cVar, view, (LinearLayout) f.h(view, 1, null)[0]);
                    n62.f28222p = -1L;
                    n62.f28206n.setTag(null);
                    view.setTag(R.id.dataBinding, n62);
                    synchronized (n62) {
                        n62.f28222p = 1L;
                    }
                    n62.i();
                    return n62;
                case 229:
                    if ("layout/view_icon_selector_0".equals(tag)) {
                        return new O6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for view_icon_selector is invalid. Received: "));
                case 230:
                    if (!"layout/view_toolbar_content_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for view_toolbar_content is invalid. Received: "));
                    }
                    Object[] h10 = f.h(view, 16, Q6.f28400E);
                    ButtonSmall buttonSmall = (ButtonSmall) h10[10];
                    ButtonSmall buttonSmall2 = (ButtonSmall) h10[11];
                    ButtonSmall buttonSmall3 = (ButtonSmall) h10[1];
                    ButtonSmall buttonSmall4 = (ButtonSmall) h10[12];
                    ImageView imageView = (ImageView) h10[14];
                    ImageView imageView2 = (ImageView) h10[4];
                    Q6 q62 = new Q6(cVar, view, buttonSmall, buttonSmall2, buttonSmall3, buttonSmall4, imageView, imageView2, (ImageView) h10[7], (ConstraintLayout) h10[0], (ShapeableImageView) h10[15], (EditText) h10[13], (TextView) h10[9], (TextView) h10[8], (TextView) h10[3], (TextView) h10[5], (LinearLayout) h10[2]);
                    q62.f28401D = -1L;
                    q62.f28335u.setTag(null);
                    view.setTag(R.id.dataBinding, q62);
                    synchronized (q62) {
                        q62.f28401D = 1L;
                    }
                    q62.i();
                    return q62;
                case 231:
                    if ("layout/view_toolbar_test_0".equals(tag)) {
                        return new R6(cVar, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for view_toolbar_test is invalid. Received: "));
                default:
                    return null;
            }
        }
        switch (i9) {
            case 51:
                if ("layout/cell_input_text_0".equals(tag)) {
                    return new E0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_input_text is invalid. Received: "));
            case 52:
                if ("layout/cell_invoices_last_0".equals(tag)) {
                    return new G0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_invoices_last is invalid. Received: "));
            case 53:
                if ("layout/cell_invoices_middle_0".equals(tag)) {
                    return new I0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_invoices_middle is invalid. Received: "));
            case 54:
                if ("layout/cell_invoices_tab_0".equals(tag)) {
                    return new J0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_invoices_tab is invalid. Received: "));
            case 55:
                if ("layout/cell_invoices_top_0".equals(tag)) {
                    return new L0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_invoices_top is invalid. Received: "));
            case 56:
                if ("layout/cell_key_value_0".equals(tag)) {
                    return new N0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_key_value is invalid. Received: "));
            case 57:
                if ("layout/cell_loan_bottom_0".equals(tag)) {
                    return new P0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_loan_bottom is invalid. Received: "));
            case 58:
                if ("layout/cell_loan_header_0".equals(tag)) {
                    return new C1345h0(cVar, view, 1);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_loan_header is invalid. Received: "));
            case 59:
                if ("layout/cell_loan_history_0".equals(tag)) {
                    return new R0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_loan_history is invalid. Received: "));
            case 60:
                if ("layout/cell_loan_main_0".equals(tag)) {
                    return new T0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_loan_main is invalid. Received: "));
            case 61:
                if ("layout/cell_loans_tab_0".equals(tag)) {
                    return new U0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_loans_tab is invalid. Received: "));
            case 62:
                if ("layout/cell_logout_button_0".equals(tag)) {
                    return new W0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_logout_button is invalid. Received: "));
            case 63:
                if ("layout/cell_new_account_type_0".equals(tag)) {
                    return new Y0(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_new_account_type is invalid. Received: "));
            case 64:
                if ("layout/cell_new_card_item_0".equals(tag)) {
                    return new C1290a1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_new_card_item is invalid. Received: "));
            case 65:
                if ("layout/cell_new_crypto_address_0".equals(tag)) {
                    return new C1298b1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_new_crypto_address is invalid. Received: "));
            case 66:
                if ("layout/cell_new_payment_small_0".equals(tag)) {
                    return new C1314d1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_new_payment_small is invalid. Received: "));
            case 67:
                if ("layout/cell_new_payments_tab_0".equals(tag)) {
                    return new C1322e1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_new_payments_tab is invalid. Received: "));
            case 68:
                if ("layout/cell_pay_from_account_0".equals(tag)) {
                    return new C1338g1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_pay_from_account is invalid. Received: "));
            case 69:
                if ("layout/cell_payment_0".equals(tag)) {
                    return new C1354i1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_payment is invalid. Received: "));
            case 70:
                if ("layout/cell_payment_details_header_0".equals(tag)) {
                    return new C1345h0(cVar, view, 2);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_payment_details_header is invalid. Received: "));
            case 71:
                if ("layout/cell_payment_saved_0".equals(tag)) {
                    return new C1370k1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_payment_saved is invalid. Received: "));
            case 72:
                if ("layout/cell_payments_tab_0".equals(tag)) {
                    return new C1378l1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_payments_tab is invalid. Received: "));
            case 73:
                if ("layout/cell_personal_data_0".equals(tag)) {
                    return new C1394n1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_personal_data is invalid. Received: "));
            case 74:
                if ("layout/cell_plan_carousel_item_0".equals(tag)) {
                    return new C1410p1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_plan_carousel_item is invalid. Received: "));
            case 75:
                if ("layout/cell_plan_data_0".equals(tag)) {
                    return new C1418q1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_plan_data is invalid. Received: "));
            case 76:
                if ("layout/cell_selector_0".equals(tag)) {
                    return new C1433s1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_selector is invalid. Received: "));
            case 77:
                if ("layout/cell_selector_crypto_account_0".equals(tag)) {
                    return new C1447u1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_selector_crypto_account is invalid. Received: "));
            case 78:
                if ("layout/cell_settings_0".equals(tag)) {
                    return new A1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_settings is invalid. Received: "));
            case 79:
                if ("layout/cell_settings_account_0".equals(tag)) {
                    return new C1461w1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_settings_account is invalid. Received: "));
            case 80:
                if ("layout/cell_settings_account_business_0".equals(tag)) {
                    return new C1475y1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_settings_account_business is invalid. Received: "));
            case 81:
                if ("layout/cell_settings_tab_0".equals(tag)) {
                    return new B1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_settings_tab is invalid. Received: "));
            case 82:
                if ("layout/cell_statements_selector_0".equals(tag)) {
                    return new H1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_statements_selector is invalid. Received: "));
            case 83:
                if ("layout/cell_statements_selector_account_0".equals(tag)) {
                    return new D1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_statements_selector_account is invalid. Received: "));
            case 84:
                if ("layout/cell_statements_selector_account_with_currency_0".equals(tag)) {
                    return new F1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_statements_selector_account_with_currency is invalid. Received: "));
            case 85:
                if ("layout/cell_statements_selector_card_0".equals(tag)) {
                    return new J1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_statements_selector_card is invalid. Received: "));
            case 86:
                if ("layout/cell_statements_selector_empty_0".equals(tag)) {
                    return new C1345h0(cVar, view, 3);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_statements_selector_empty is invalid. Received: "));
            case 87:
                if ("layout/cell_support_item_0".equals(tag)) {
                    return new L1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_support_item is invalid. Received: "));
            case 88:
                if ("layout/cell_transaction_0".equals(tag)) {
                    return new N1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transaction is invalid. Received: "));
            case 89:
                if ("layout/cell_transaction_header_0".equals(tag)) {
                    return new P1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transaction_header is invalid. Received: "));
            case 90:
                if ("layout/cell_transaction_last_0".equals(tag)) {
                    return new R1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transaction_last is invalid. Received: "));
            case 91:
                if ("layout/cell_transaction_middle_0".equals(tag)) {
                    return new T1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transaction_middle is invalid. Received: "));
            case 92:
                if ("layout/cell_transaction_top_0".equals(tag)) {
                    return new V1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transaction_top is invalid. Received: "));
            case 93:
                if ("layout/cell_transfer_account_0".equals(tag)) {
                    return new X1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_transfer_account is invalid. Received: "));
            case 94:
                if ("layout/cell_wallet_header_0".equals(tag)) {
                    return new Y1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for cell_wallet_header is invalid. Received: "));
            case 95:
                if ("layout/dialog_crypto_filter_0".equals(tag)) {
                    return new Z1(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_crypto_filter is invalid. Received: "));
            case 96:
                if ("layout/dialog_filter_0".equals(tag)) {
                    return new C1299b2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_filter is invalid. Received: "));
            case 97:
                if ("layout/dialog_filter_saved_0".equals(tag)) {
                    return new C1307c2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_filter_saved is invalid. Received: "));
            case 98:
                if ("layout/dialog_input_text_0".equals(tag)) {
                    return new C1323e2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_input_text is invalid. Received: "));
            case 99:
                if ("layout/dialog_invoice_0".equals(tag)) {
                    return new C1331f2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_invoice is invalid. Received: "));
            case 100:
                if ("layout/dialog_passcode_0".equals(tag)) {
                    return new C1347h2(cVar, view);
                }
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.j(tag, "The tag for dialog_passcode is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // F0.b
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11163a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // F0.b
    public final f getDataBinder(c cVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f11161a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
