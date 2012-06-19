/*
 * SMAS - Scala Multi Agent System
 * Copyright (C) 2012  Rico Lieback
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */

package de.hsaugsburg.smas.services.messages

import de.hsaugsburg.smas.communication.BaseMessage
import de.hsaugsburg.smas.naming.AddressBookEntry


case class RegisterHolonMember(newMember: AddressBookEntry) extends BaseMessage with ManagementMessage

case class UnRegisterHolonMember(member: AddressBookEntry) extends BaseMessage with ManagementMessage

case class GetAllKnownMembers() extends BaseMessage with ManagementMessage

case class AllKnownMembers(members: List[AddressBookEntry]) extends BaseMessage with ManagementMessage

case class RegisterService(service: String, location: AddressBookEntry) extends BaseMessage with ManagementMessage

case class UnRegisterService(service: String, location: AddressBookEntry) extends BaseMessage with ManagementMessage

case class RegisterHolon(holon: AddressBookEntry) extends BaseMessage with ManagementMessage

case class UnRegisterHolon(holon: AddressBookEntry) extends BaseMessage with ManagementMessage

case class GetAllKnownHolons() extends BaseMessage with ManagementMessage

case class AllKnownHolons(holons: List[AddressBookEntry]) extends BaseMessage with ManagementMessage