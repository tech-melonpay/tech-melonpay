package com.luminary.business.presentation.utils.bottomDialog;

import com.google.firebase.messaging.Constants;

/* compiled from: BottomDialogType.kt */
/* loaded from: classes2.dex */
public enum BottomDialogType {
    error(Type.ERROR),
    success(Type.OK),
    questions(null),
    custom(null);


    /* renamed from: k, reason: collision with root package name */
    public static final a f13289k = new a();

    /* renamed from: g, reason: collision with root package name */
    public Type f13301g;

    /* renamed from: a, reason: collision with root package name */
    public String f13295a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f13296b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f13297c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f13298d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f13299e = null;

    /* renamed from: f, reason: collision with root package name */
    public Integer f13300f = null;

    /* renamed from: h, reason: collision with root package name */
    public Float f13302h = null;
    public Float i = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f13303j = null;

    /* compiled from: BottomDialogType.kt */
    public enum Type {
        CARD("card"),
        /* JADX INFO: Fake field, exist only in values array */
        CELEBRATION("celebration"),
        CLOCK("clock"),
        ERROR(Constants.IPC_BUNDLE_KEY_SEND_ERROR),
        /* JADX INFO: Fake field, exist only in values array */
        INFO("info"),
        HELP("help"),
        HELP_BLACK("help_black"),
        OK("ok"),
        /* JADX INFO: Fake field, exist only in values array */
        PASSCODE("passcode"),
        PERSONAL("personal"),
        /* JADX INFO: Fake field, exist only in values array */
        TEST("card2");


        /* renamed from: a, reason: collision with root package name */
        public final String f13311a;

        Type(String str) {
            this.f13311a = str;
        }
    }

    /* compiled from: BottomDialogType.kt */
    public static final class a {
        public static BottomDialogType a() {
            BottomDialogType bottomDialogType = BottomDialogType.custom;
            bottomDialogType.f13295a = null;
            bottomDialogType.f13296b = null;
            bottomDialogType.f13300f = null;
            bottomDialogType.f13301g = null;
            bottomDialogType.f13297c = null;
            bottomDialogType.f13298d = null;
            bottomDialogType.f13299e = null;
            bottomDialogType.f13302h = null;
            bottomDialogType.i = null;
            return bottomDialogType;
        }

        public static BottomDialogType b() {
            BottomDialogType bottomDialogType = BottomDialogType.error;
            bottomDialogType.f13295a = null;
            bottomDialogType.f13296b = null;
            bottomDialogType.f13297c = null;
            bottomDialogType.f13298d = null;
            bottomDialogType.f13299e = null;
            bottomDialogType.f13300f = null;
            bottomDialogType.f13301g = Type.ERROR;
            bottomDialogType.f13302h = null;
            bottomDialogType.i = null;
            return bottomDialogType;
        }

        public static BottomDialogType c() {
            BottomDialogType bottomDialogType = BottomDialogType.questions;
            bottomDialogType.f13295a = null;
            bottomDialogType.f13296b = null;
            bottomDialogType.f13300f = null;
            bottomDialogType.f13301g = null;
            bottomDialogType.f13297c = null;
            bottomDialogType.f13298d = null;
            bottomDialogType.f13299e = null;
            bottomDialogType.f13302h = null;
            bottomDialogType.i = null;
            return bottomDialogType;
        }

        public static BottomDialogType d() {
            BottomDialogType bottomDialogType = BottomDialogType.success;
            bottomDialogType.f13295a = null;
            bottomDialogType.f13296b = null;
            bottomDialogType.f13297c = null;
            bottomDialogType.f13298d = null;
            bottomDialogType.f13299e = null;
            bottomDialogType.f13300f = null;
            bottomDialogType.f13301g = Type.OK;
            bottomDialogType.f13302h = null;
            bottomDialogType.i = null;
            return bottomDialogType;
        }
    }

    BottomDialogType(Type type) {
        this.f13301g = type;
    }
}
