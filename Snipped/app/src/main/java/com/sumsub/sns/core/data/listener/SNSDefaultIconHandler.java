package com.sumsub.sns.core.data.listener;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.helper.a;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSDefaultIconHandler;", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "()V", "onResolveIcon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "key", "", "stepIcon", "", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public class SNSDefaultIconHandler implements SNSIconHandler {
    private final int stepIcon(DocumentType documentType) {
        return documentType.g() ? R$drawable.sns_ic_step_identity : documentType.h() ? R$drawable.sns_ic_step_poa : documentType.k() ? R$drawable.sns_ic_step_selfie : documentType.d() ? R$drawable.sns_ic_step_applicant_data : documentType.j() ? R$drawable.sns_ic_step_questionnaire : documentType.i() ? R$drawable.sns_ic_step_phone : documentType.f() ? R$drawable.sns_ic_step_email : documentType.e() ? R$drawable.sns_ic_step_ekyc : documentType.m() ? R$drawable.sns_ic_step_video_ident : R$drawable.sns_ic_step_identity;
    }

    @Override // com.sumsub.sns.core.data.listener.SNSIconHandler
    public Drawable onResolveIcon(Context context, String key) {
        int stepIcon;
        Drawable a10 = a.f14273a.a(key);
        if (a10 != null) {
            return a10;
        }
        if (f.b(key, "default/videoident")) {
            stepIcon = R$drawable.sns_ic_videoident_intro_face;
        } else if (f.b(key, "default/do_idCard")) {
            stepIcon = R$drawable.sns_ic_intro_do;
        } else if (f.b(key, "default/do_passport")) {
            stepIcon = R$drawable.sns_ic_intro_do_passport;
        } else if (f.b(key, "default/dont_idCard")) {
            stepIcon = R$drawable.sns_ic_intro_dont;
        } else if (f.b(key, "default/dont_passport")) {
            stepIcon = R$drawable.sns_ic_intro_dont_passport;
        } else if (f.b(key, "default/facescan")) {
            stepIcon = R$drawable.sns_ic_intro_liveness;
        } else if (f.b(key, "default/do_idCard_backSide")) {
            stepIcon = R$drawable.sns_ic_intro_do_back;
        } else if (f.b(key, "default/dont_idCard_backSide")) {
            stepIcon = R$drawable.sns_ic_intro_dont_back;
        } else if (f.b(key, "IdentityType/PASSPORT")) {
            stepIcon = R$drawable.sns_ic_iddoc_passport;
        } else if (f.b(key, "IdentityType/DRIVERS")) {
            stepIcon = R$drawable.sns_ic_iddoc_driving_license;
        } else if (f.b(key, "IdentityType/RESIDENCE_PERMIT")) {
            stepIcon = R$drawable.sns_ic_iddoc_residence_permit;
        } else if (f.b(key, SNSIconHandler.SNSResultIcons.SUCCESS.getImageName())) {
            stepIcon = R$drawable.sns_ic_success;
        } else if (f.b(key, SNSIconHandler.SNSResultIcons.FAILURE.getImageName())) {
            stepIcon = R$drawable.sns_ic_fatal;
        } else if (f.b(key, SNSIconHandler.SNSResultIcons.SUBMITTED.getImageName())) {
            stepIcon = R$drawable.sns_ic_submitted;
        } else if (f.b(key, SNSIconHandler.SNSResultIcons.WARNING.getImageName())) {
            stepIcon = R$drawable.sns_ic_warning;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.WARNING_OUTLINE.getImageName())) {
            stepIcon = R$drawable.sns_ic_warning_outline;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.CLOSE.getImageName())) {
            stepIcon = R$drawable.sns_ic_close;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.BACK.getImageName())) {
            stepIcon = R$drawable.sns_ic_back;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName())) {
            stepIcon = R$drawable.sns_ic_step_open;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.TORCH_ON.getImageName())) {
            stepIcon = R$drawable.sns_ic_flash_on;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName())) {
            stepIcon = R$drawable.sns_ic_flash_off;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.GALLERY.getImageName())) {
            stepIcon = R$drawable.sns_ic_gallery;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.MAIL.getImageName())) {
            stepIcon = R$drawable.sns_ic_email;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.NFC.getImageName())) {
            stepIcon = R$drawable.sns_ic_nfc_logo;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.MRTD_PASSPORT.getImageName())) {
            stepIcon = R$drawable.sns_ic_mrtd_passport;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.MRTD_IDCARD.getImageName())) {
            stepIcon = R$drawable.sns_ic_mrtd_id_card;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.MRTD_PHONE.getImageName())) {
            stepIcon = R$drawable.sns_ic_mrtd_hand;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.BIN.getImageName())) {
            stepIcon = R$drawable.sns_ic_delete;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.CALENDAR.getImageName())) {
            stepIcon = R$drawable.sns_ic_calendar;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ATTACHMENT.getImageName())) {
            stepIcon = R$drawable.sns_ic_attachment;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.IMAGE.getImageName())) {
            stepIcon = R$drawable.sns_ic_image;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.SEARCH.getImageName())) {
            stepIcon = R$drawable.sns_ic_search;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName())) {
            stepIcon = R$drawable.sns_ic_notify;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.TAKE_PHOTO.getImageName())) {
            stepIcon = R$drawable.sns_ic_capture;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.LOCATION_ON.getImageName())) {
            stepIcon = R$drawable.sns_ic_location_on;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.LOCATION_OFF.getImageName())) {
            stepIcon = R$drawable.sns_ic_location_off;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.COUNTRY_OTHER.getImageName())) {
            stepIcon = R$drawable.sns_ic_flag_placeholder;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.PICTURE_AGREEMENT.getImageName())) {
            stepIcon = R$drawable.sns_ic_earth;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_ID.getImageName())) {
            stepIcon = R$drawable.sns_ic_iddoc_id_card;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_HOME.getImageName())) {
            stepIcon = R$drawable.sns_ic_iddoc_residence_permit;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_PERSONS.getImageName())) {
            stepIcon = R$drawable.sns_ic_persons;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_LIGHT.getImageName())) {
            stepIcon = R$drawable.sns_ic_light;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_CAMERA.getImageName())) {
            stepIcon = R$drawable.sns_ic_camera;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ICON_WIFI.getImageName())) {
            stepIcon = R$drawable.sns_ic_wifi;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.WARNING.getImageName())) {
            stepIcon = R$drawable.sns_ic_warning_triangle;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ROTATE_CW.getImageName())) {
            stepIcon = R$drawable.sns_ic_rotate_cw;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.ROTATE_CCW.getImageName())) {
            stepIcon = R$drawable.sns_ic_rotate_ccw;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.FLIP.getImageName())) {
            stepIcon = R$drawable.sns_flip;
        } else if (f.b(key, SNSIconHandler.SNSCommonIcons.SUCCESS_CHECK.getImageName())) {
            stepIcon = R$drawable.sns_ic_success_check;
        } else if (f.b(key, SNSIconHandler.SNSEidIcons.PIN.getImageName())) {
            stepIcon = R$drawable.sns_ic_pin;
        } else if (f.b(key, SNSIconHandler.SNSEidIcons.DONE.getImageName())) {
            stepIcon = R$drawable.sns_ic_success;
        } else if (f.b(key, SNSIconHandler.SNSEidIcons.ID_CARD.getImageName())) {
            stepIcon = R$drawable.sns_ic_id_hand;
        } else if (f.b(key, SNSIconHandler.SNSEidIcons.NFC_SCAN.getImageName())) {
            stepIcon = R$drawable.sns_ic_nfc_id;
        } else if (f.b(key, SNSIconHandler.SNSEidIcons.CAN.getImageName())) {
            stepIcon = R$drawable.sns_ic_eid_can;
        } else if (key.startsWith("IdentityType/")) {
            stepIcon = R$drawable.sns_ic_iddoc_id_card;
        } else if (key.startsWith("Flag/")) {
            int a11 = i.a(context, "sns_ic_flag_".concat(C0969n.t0(key, "/")));
            Integer valueOf = Integer.valueOf(a11);
            if (a11 == 0) {
                valueOf = null;
            }
            stepIcon = valueOf != null ? valueOf.intValue() : R$drawable.sns_ic_flag_placeholder;
        } else {
            stepIcon = key.startsWith("DocType/") ? stepIcon(new DocumentType(C0969n.t0(key, "/"))) : -1;
        }
        Integer valueOf2 = Integer.valueOf(stepIcon);
        if (stepIcon == -1) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            return null;
        }
        int intValue = valueOf2.intValue();
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
        Drawable drawable = resources.getDrawable(intValue, theme);
        if (drawable == null) {
            return null;
        }
        drawable.applyTheme(context.getTheme());
        return drawable;
    }
}
