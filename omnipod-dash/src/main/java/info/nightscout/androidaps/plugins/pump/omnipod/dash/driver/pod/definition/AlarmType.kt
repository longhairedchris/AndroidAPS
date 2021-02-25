package info.nightscout.androidaps.plugins.pump.omnipod.dash.driver.pod.definition

enum class AlarmType(private val value: Byte) {
    NONE(0x00.toByte()), ALARM_PW_FLASH_ERASE(0x01.toByte()), ALARM_PW_FLASH_WRITE(0x02.toByte()), ALARM_BASAL_CKSUM(0x03.toByte()), ALARM_BASAL_PPULSE(0x04.toByte()), ALARM_BASAL_STEP(0x05.toByte()), ALARM_AUTO_WAKEUP_TIMEOUT(0x06.toByte()), ALARM_WIRE_OVERDRIVEN(0x07.toByte()), ALARM_BEEP_REP_INVALID_INDEX(0x08.toByte()), ALARM_INVALID_REP_PATTERN(0x09.toByte()), ALARM_TEMP_BASAL_STEP(0x0a.toByte()), ALARM_TEMP_BASAL_CKSUM(0x0b.toByte()), ALARM_BOLUS_OVERFLOW(0x0c.toByte()), ALARM_COP_RESET(0x0d.toByte()), ALARM_ILOP_RESET(0x0e.toByte()), ALARM_ILAD_RESET(0x0f.toByte()), ALARM_SAWCOP_RESET(0x10.toByte()), ALARM_BOLUS_STEP(0x11.toByte()), ALARM_LVD_RESET(0x12.toByte()), ALARM_INVALID_RF_MSG_LENGTH(0x13.toByte()), ALARM_OCCLUDED(0x14.toByte()), ALARM_BOLUSPROG_CHKSUM(0x15.toByte()), ALARM_BOLUS_LOG(0x16.toByte()), ALARM_CRITICAL_VAR(0x17.toByte()), ALARM_EMPTY_RESERVOIR(0x18.toByte()), ALARM_LOADERR(0x19.toByte()), ALARM_PSA_FAILURE(0x1a.toByte()), ALARM_TICKCNT_NOT_CLEARED(0x1b.toByte()), ALARM_PUMP_EXPIRED(0x1c.toByte()), ALARM_COMD_BIT_NOT_SET(0x1d.toByte()), ALARM_INVALID_COMD_SET(0x1e.toByte()), ALARM_ALERTS_ARRAY_CKSM(0x1f.toByte()), ALARM_UNIT_TEST(0x20.toByte()), ALARM_TICK_TIME_ERROR(0x21.toByte()), ALARM_CRITICAL_HAZARD(0x22.toByte()), ALARM_PIEZO_FREQ(0x23.toByte()), ALARM_TICKCNT_ERROR_RTC(0x24.toByte()), ALARM_TICK_FAILURE(0x25.toByte()), ALARM_INVALID(0x26.toByte()), ALARM_LUMP_ALERT_PROGRAM(0x27.toByte()), ALARM_INVALID_PASS_CODE(0x28.toByte()), ALARM_ALERT0(0x29.toByte()), ALARM_ALERT1(0x2a.toByte()), ALARM_ALERT2(0x2b.toByte()), ALARM_ALERT3(0x2c.toByte()), ALARM_ALERT4(0x2d.toByte()), ALARM_ALERT5(0x2e.toByte()), ALARM_ALERT6(0x2f.toByte()), ALARM_ALERT7(0x30.toByte()), ALARM_ILLEGAL_PUMP_STATE(0x31.toByte()), ALARM_COP_TEST_FAILURE(0x32.toByte()), ALARM_MCTF(0x33.toByte()), ALARM_ILLEGAL_RESET(0x34.toByte()), ALARM_VETO_NOT_SET(0x35.toByte()), ALARM_ILLEGAL_PIN_RESET(0x36.toByte()), ALARM_INVALID_BEEP_PATTERN(0x37.toByte()), ALARM_WIRE_STATE_MACHINE(0x38.toByte()), ALARM_VETO_TEST_DEFAULT(0x39.toByte()), ALARM_ALERT_INVALID_INDEX(0x3a.toByte()), ALARM_SAWCOP_TEST_FAIL(0x3b.toByte()), ALARM_MCUCOP_TEST_FAIL(0x3c.toByte()), ALARM_STEP_SENSOR_SHORTED(0x3d.toByte()), ALARM_FLASH_FAILURE(0x3e.toByte()), ALARM_SPARE63(0x3f.toByte()), ALARM_SS_OPEN_CNT_EXCEEDED(0x40.toByte()), ALARM_SS_EXCESSIVE_SUMMED(0x41.toByte()), ALARM_SS_MIN_PULSE_TRANSITION(0x42.toByte()), ALARM_SS_DEFAULT(0x43.toByte()), ALARM_OPEN_WIRE1(0x44.toByte()), ALARM_OPEN_WIRE2(0x45.toByte()), ALARM_LOADERR_FAILURE(0x46.toByte()), ALARM_SAW_VETO_FAILURE(0x47.toByte()), ALARM_BAD_RFM_CLOCK(0x48.toByte()), ALARM_BAD_TICK_HIGH(0x49.toByte()), ALARM_BAD_TICK_PERIOD(0x4a.toByte()), ALARM_BAD_TRIM_VALUE(0x4b.toByte()), ALARM_BAD_BUS_CLOCK(0x4c.toByte()), ALARM_BAD_CAL_MODE(0x4d.toByte()), ALARM_SAW_TRIM_ERROR(0x4e.toByte()), ALARM_RFM_CRYSTAL_ERROR(0x4f.toByte()), ALARM_CALST_TIMEOUT(0x50.toByte()), ALARM_TICKCNT_ERROR(0x51.toByte()), ALARM_BAD_RFM_XTAL_START(0x52.toByte()), ALARM_BAD_RX_SENSENSITIVITY(0x53.toByte()), ALARM_BAD_TX_PKT_SIZE(0x54.toByte()), ALARM_TICK_LOW_PHASE_EXCEEDED(0x55.toByte()), ALARM_TICK_HIGH_PHASE_EXCEEDED(0x56.toByte()), ALARM_OCCL_CRITVAR_FAIL(0x57.toByte()), ALARM_OCCL_PARAM(0x58.toByte()), ALARM_PROG_OCCL_FAIL(0x59.toByte()), ALARM_PW_TO_HIGH_FOR_OCCL_DET(0x5a.toByte()), ALARM_OCCL_CSUM(0x5b.toByte()), ALARM_PRIME_OPEN_CNT_TO_LOW(0x5c.toByte()), ALARM_BAD_RF_CDTHR(0x5d.toByte()), ALARM_FLASH_NOT_SECURE(0x5e.toByte()), ALARM_WIRE_TEST_OPEN_GROUND(0x5f.toByte()), ALARM_OCCL_STARTUP1(0x60.toByte()), ALARM_OCCL_STARTUP2(0x61.toByte()), ALARM_OCCL_EXCESS_TIMEOUTS1(0x62.toByte()), ALARM_SPARE99(0x63.toByte()), ALARM_SPARE100(0x64.toByte()), ALARM_SPARE101(0x65.toByte()), ALARM_OCCL_EXCESS_TIMEOUTS2(0x66.toByte()), ALARM_OCCL_EXCESS_TIMEOUTS3(0x67.toByte()), ALARM_OCCL_NOISY_PULSE_WIDTHS(0x68.toByte()), ALARM_OCCL_AT_BOLUS_END(0x69.toByte()), ALARM_OCCL_ABOVE_THRESHOLD(0x6a.toByte()), ALARM_BASAL_UNDERINFUSION(0x80.toByte()), ALARM_BASAL_OVERINFUSION(0x81.toByte()), ALARM_TEMP_UNDERINFUSION(0x82.toByte()), ALARM_TEMP_OVERINFUSION(0x83.toByte()), ALARM_BOLUS_UNDERINFUSION(0x84.toByte()), ALARM_BOLUS_OVERINFUSION(0x85.toByte()), ALARM_BASAL_OVERINFUSION_PULSE(0x86.toByte()), ALARM_TEMP_OVERINFUSION_PULSE(0x87.toByte()), ALARM_BOLUS_OVERINFUSION_PULSE(0x88.toByte()), ALARM_IMMBOLUS_UNDERINFUSION_PULSE(0x89.toByte()), ALARM_EXTBOLUS_OVERINFUSION_PULSE(0x8a.toByte()), ALARM_PROGRAM_CSUM(0x8b.toByte()), ALARM_UNUSED_140(0x8c.toByte()), ALARM_UNRECOGNIZED_PULSE(0x8d.toByte()), ALARM_SYNC_WITHOUT_TEMP_ACTIVE(0x8e.toByte()), ALARM_INTERLOCK_LOAD(0x8f.toByte()), ALARM_ILLEGAL_CHAN_PARAM(0x90.toByte()), ALARM_BASAL_PULSE_CHAN_INACTIVE(0x91.toByte()), ALARM_TEMP_PULSE_CHAN_INACTIVE(0x92.toByte()), ALARM_BOLUS_PULSE_CHAN_INACTIVE(0x93.toByte()), ALARM_INT_SEMAPHORE_NOT_SET(0x94.toByte()), ALARM_ILLEGAL_INTERLOCK_CHAN(0x95.toByte()), ALARM_TERMINATE_BOLUS(0x96.toByte()), ALARM_OPEN_TRANSITIONS_COUNT(0x97.toByte()), ALARM_BLE_TO(0xa0.toByte()), ALARM_BLE_INITIATED(0xa1.toByte()), ALARM_BLE_UNK_ALARM(0xa2.toByte()), ALARM_UNUSED_163(0xa3.toByte()), ALARM_UNUSED_164(0xa4.toByte()), ALARM_UNUSED_165(0xa5.toByte()), ALARM_BLE_IAAS(0xa6.toByte()), ALARM_UNUSED_167(0xa7.toByte()), ALARM_CRC_FAILURE(0xa8.toByte()), ALARM_BLE_WD_PING_TIMEOUT(0xa9.toByte()), ALARM_BLE_EXCESSIVE_RESETS(0xaa.toByte()), ALARM_BLE_NAK_ERROR(0xab.toByte()), ALARM_BLE_REQ_HIGH_TIMEOUT(0xac.toByte()), ALARM_BLE_UNKNOWN_RESP(0xad.toByte()), ALARM_BLE_UNUSED_174(0xae.toByte()), ALARM_BLE_REQ_STUCK_HIGH(0xaf.toByte()), ALARM_BLE_STATE_MACHINE_1(0xb1.toByte()), ALARM_BLE_STATE_MACHINE_2(0xb2.toByte()), ALARM_BLE_UNUSED_179(0xb3.toByte()), ALARM_BLE_ARB_LOST(0xb4.toByte()), ALARM_BLE_ER48_DUAL_NACK(0xc0.toByte()), ALARM_BLE_QN_EXCEED_MAX_RETRY(0xc1.toByte()), ALARM_BLE_QN_CRIT_VAR_FAIL(0xc2.toByte()), UNKNOWN(0xff.toByte());

    companion object {

        fun byValue(value: Byte): AlarmType {
            for (type in values()) {
                if (type.value == value) {
                    return type
                }
            }
            return UNKNOWN
        }
    }
}