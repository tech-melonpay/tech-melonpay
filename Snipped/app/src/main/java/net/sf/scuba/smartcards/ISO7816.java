package net.sf.scuba.smartcards;

/* loaded from: classes2.dex */
public interface ISO7816 {
    public static final byte CLA_COMMAND_CHAINING = 16;
    public static final byte CLA_ISO7816 = 0;
    public static final byte INS_APPEND_RECORD = -30;
    public static final byte INS_ASK_RANDOM = -124;
    public static final byte INS_CHANGE_CHV = 36;
    public static final byte INS_CLOSE_APPLICATION = -84;
    public static final byte INS_CREATE_FILE = -32;
    public static final byte INS_DECREASE = 48;
    public static final byte INS_DECREASE_STAMPED = 52;
    public static final byte INS_DELETE_FILE = -28;
    public static final byte INS_ENVELOPE = -62;
    public static final byte INS_ERASE_BINARY = 14;
    public static final byte INS_EXTERNAL_AUTHENTICATE = -126;
    public static final byte INS_GET_CHALLENGE = -124;
    public static final byte INS_GET_DATA = -54;
    public static final byte INS_GET_RESPONSE = -64;
    public static final byte INS_GIVE_RANDOM = -122;
    public static final byte INS_INCREASE = 50;
    public static final byte INS_INTERNAL_AUTHENTICATE = -120;
    public static final byte INS_LOAD_KEY_FILE = -40;
    public static final byte INS_MANAGE_CHANNEL = 112;
    public static final byte INS_MSE = 34;
    public static final byte INS_MUTUAL_AUTHENTICATE = -126;
    public static final byte INS_PSO = 42;
    public static final byte INS_PUT_DATA = -38;
    public static final byte INS_READ_BINARY = -80;
    public static final byte INS_READ_BINARY2 = -79;
    public static final byte INS_READ_BINARY_STAMPED = -76;
    public static final byte INS_READ_RECORD = -78;
    public static final byte INS_READ_RECORD2 = -77;
    public static final byte INS_READ_RECORDS = -78;
    public static final byte INS_READ_RECORD_STAMPED = -74;
    public static final byte INS_REHABILITATE_CHV = 68;
    public static final byte INS_SEEK = -94;
    public static final byte INS_SELECT = -92;
    public static final byte INS_SELECT_FILE = -92;
    public static final byte INS_UNBLOCK_CHV = 44;
    public static final byte INS_UPDATE_BINARY = -42;
    public static final byte INS_UPDATE_RECORD = -36;
    public static final byte INS_VERIFY = 32;
    public static final byte INS_WRITE_BINARY = -48;
    public static final byte INS_WRITE_RECORD = -46;
    public static final byte INVALIDATE_CHV = 4;
    public static final byte OFFSET_CDATA = 5;
    public static final byte OFFSET_CLA = 0;
    public static final byte OFFSET_INS = 1;
    public static final byte OFFSET_LC = 4;
    public static final byte OFFSET_P1 = 2;
    public static final byte OFFSET_P2 = 3;
    public static final short SW_APPLET_SELECT_FAILED = 27033;
    public static final short SW_BYTES_REMAINING_00 = 24832;
    public static final short SW_CARD_TERMINATED = 28671;
    public static final short SW_CLA_NOT_SUPPORTED = 28160;
    public static final short SW_COMMAND_NOT_ALLOWED = 27014;
    public static final short SW_CONDITIONS_NOT_SATISFIED = 27013;
    public static final short SW_CORRECT_LENGTH_00 = 27648;
    public static final short SW_DATA_INVALID = 27012;
    public static final short SW_END_OF_FILE = 25218;
    public static final short SW_EXPECTED_SM_DATA_OBJECTS_MISSING = 27015;
    public static final short SW_FILEHEADER_INCONSISTENT = 27264;
    public static final short SW_FILE_FULL = 27268;
    public static final short SW_FILE_INVALID = 27011;
    public static final short SW_FILE_NOT_FOUND = 27266;
    public static final short SW_FUNC_NOT_SUPPORTED = 27265;
    public static final short SW_INCORRECT_P1P2 = 27270;
    public static final short SW_INS_NOT_SUPPORTED = 27904;
    public static final short SW_KEY_NOT_FOUND = 27272;
    public static final short SW_KEY_USAGE_ERROR = 27073;
    public static final short SW_LAST_COMMAND_EXPECTED = 26755;
    public static final short SW_LESS_DATA_RESPONDED_THAN_REQUESTED = 25223;
    public static final short SW_LOGICAL_CHANNEL_NOT_SUPPORTED = 26753;
    public static final short SW_NON_VOLATILE_MEMORY_CHANGED_COUNTER_0 = 25536;
    public static final short SW_NON_VOLATILE_MEMORY_CHANGED_FILE_FILLED_UP_BY_LAST_WRITE = 25473;
    public static final short SW_NON_VOLATILE_MEMORY_CHANGED_NO_INFORMATION_GIVEN = 25344;
    public static final short SW_NO_ERROR = -28672;
    public static final short SW_OUT_OF_MEMORY = 27268;
    public static final short SW_RECORD_NOT_FOUND = 27267;
    public static final short SW_SECURE_MESSAGING_NOT_SUPPORTED = 26754;
    public static final short SW_SECURITY_STATUS_NOT_SATISFIED = 27010;
    public static final short SW_SM_DATA_OBJECTS_INCORRECT = 27016;
    public static final short SW_STATE_NON_VOLATILE_MEMORY_UNCHANGED_NO_INFORMATION_GIVEN = 25088;
    public static final short SW_UNKNOWN = 28416;
    public static final short SW_WRONG_DATA = 27264;
    public static final short SW_WRONG_LENGTH = 26368;
    public static final short SW_WRONG_P1P2 = 27392;
    public static final int TAG_SM_CRYPTOGRAPHIC_CHECKSUM = 142;
    public static final int TAG_SM_ENCRYPTED_DATA = 133;
    public static final int TAG_SM_ENCRYPTED_DATA_WITH_PADDING_INDICATOR = 135;
    public static final int TAG_SM_EXPECTED_LENGTH = 151;
    public static final int TAG_SM_STATUS_WORD = 153;
}
