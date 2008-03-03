/*
 * Copyright 2008 Emil Jönsson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emilsebastian.plump.event;

import com.emilsebastian.plump.model.Card;

public class CardSelectedEvent implements PlumpEvent {

	private final Card card;
	
	
	public CardSelectedEvent(Card card) {
		this.card = card;
	}
	
	
	public Card getCard() {
		return card;
	}
	
	
	@Override public EventName getName() {
		return EventName.CARD_SELECTED;
	}

}