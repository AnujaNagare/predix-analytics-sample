/*
 * Copyright (c) 2015 - 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.ge.predix.analytics.customdto;

public class LocoRegressionRequest {

	protected WindLocoRTMValues test;
	protected WindLocoRTMValues train;

	public WindLocoRTMValues getTest() {
		return test;
	}

	public void setTest(WindLocoRTMValues test) {
		this.test = test;
	}

	public WindLocoRTMValues getTrain() {
		return train;
	}

	public void setTrain(WindLocoRTMValues train) {
		this.train = train;
	}
}
