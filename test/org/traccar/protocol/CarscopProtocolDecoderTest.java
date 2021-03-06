package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class CarscopProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        CarscopProtocolDecoder decoder = new CarscopProtocolDecoder(new CarscopProtocol());

        verifyPosition(decoder, text(
                "*040331141830UB05123456789012345061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"),
                position("2004-03-31 06:18:25.000", true, 29.56689, 106.45424));

        verifyPosition(decoder, text(
                "*040331141830UB04999999984061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"));

        verifyPosition(decoder, text(
                "*040331141830UA012Hi-jack061825A2934.0133N10627.2544E000.0040331309.6200000000L000000"));

        verifyPosition(decoder, text(
                "*150817160254UB05CC8011400042499160254A2106.8799S14910.2583E000.0150817158.3511111111L000000"));

    }

}
