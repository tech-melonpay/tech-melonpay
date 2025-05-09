package com.sumsub.sns.internal.util;

/* loaded from: classes2.dex */
public enum DataUnit {
    KILOBYTES { // from class: com.sumsub.sns.internal.util.DataUnit.1
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1000;
        }
    },
    MEGABYTES { // from class: com.sumsub.sns.internal.util.DataUnit.2
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1000000;
        }
    },
    GIGABYTES { // from class: com.sumsub.sns.internal.util.DataUnit.3
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1000000000;
        }
    },
    TERABYTES { // from class: com.sumsub.sns.internal.util.DataUnit.4
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1000000000000L;
        }
    },
    KIBIBYTES { // from class: com.sumsub.sns.internal.util.DataUnit.5
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1024;
        }
    },
    MEBIBYTES { // from class: com.sumsub.sns.internal.util.DataUnit.6
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1048576;
        }
    },
    GIBIBYTES { // from class: com.sumsub.sns.internal.util.DataUnit.7
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1073741824;
        }
    },
    TEBIBYTES { // from class: com.sumsub.sns.internal.util.DataUnit.8
        @Override // com.sumsub.sns.internal.util.DataUnit
        public long toBytes(long j10) {
            return j10 * 1099511627776L;
        }
    };

    public long toBytes(long j10) {
        throw new AbstractMethodError();
    }
}
