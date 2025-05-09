package com.sumsub.sns.presentation.utils;

import androidx.fragment.app.Fragment;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSCountryPickerDialog;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.presentation.screen.questionnary.SNSQuestionnaireFragment;
import com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment;

/* loaded from: classes2.dex */
public final class a {
    public static final Screen a(Fragment fragment) {
        return fragment instanceof com.sumsub.sns.presentation.screen.intro.a ? Screen.InstructionsScreen : fragment instanceof com.sumsub.sns.presentation.screen.verification.a ? Screen.StatusScreen : fragment instanceof com.sumsub.sns.presentation.dialogs.bottomsheet.a ? Screen.AgreementScreen : fragment instanceof SNSCountryPickerDialog ? Screen.CountriesScreen : fragment instanceof com.sumsub.sns.presentation.screen.preview.photo.identity.a ? Screen.PreviewScreen : fragment instanceof com.sumsub.sns.presentation.screen.preview.photo.mrtd.a ? Screen.MrtdScreen : fragment instanceof com.sumsub.sns.presentation.screen.preview.selfie.a ? Screen.PreviewScreen : fragment instanceof com.sumsub.sns.presentation.screen.preview.applicantdata.a ? Screen.ApplicantDataScreen : fragment instanceof com.sumsub.sns.presentation.screen.preview.photo.common.a ? Screen.PreviewScreen : fragment instanceof SNSLiveness3dFaceFragment ? Screen.LivenessScreen : fragment instanceof com.sumsub.sns.core.presentation.screen.verification.a ? Screen.ConfirmationContactScreen : fragment instanceof SNSQuestionnaireFragment ? Screen.QuestionnaireScreen : fragment instanceof com.sumsub.sns.core.presentation.support.a ? Screen.SupportScreen : fragment instanceof SNSPickerDialog ? Screen.SystemImagePicker : fragment instanceof com.sumsub.sns.camera.photo.presentation.a ? Screen.DocTypeSelectorScreen : fragment instanceof com.sumsub.sns.camera.photo.presentation.selfie.a ? Screen.CameraScreen : fragment instanceof com.sumsub.sns.camera.photo.presentation.document.a ? Screen.CameraScreen : fragment instanceof com.sumsub.sns.camera.video.presentation.a ? Screen.VideoScreen : fragment instanceof com.sumsub.sns.presentation.consent.a ? Screen.AgreementSelectorScreen : Screen.Other;
    }
}
