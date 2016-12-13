//
//  bankTests.swift
//  bankTests
//
//  Created by Daniele Conti on 13/12/2016.
//  Copyright © 2016 Daniele Conti. All rights reserved.
//

import XCTest
@testable import bank

class bankTests: XCTestCase {
    
    let usd = Currency(name: "USD", ratio: 1)
    
    var bank: Bank!
    
    override func setUp() {
        super.setUp()
        
        let zero = Balance(amount: 0, currency: usd)
        bank = Bank(settings: Settings(initialBalance: zero, currency: usd))
        
    }
    
    func testCredit() {
        bank.credit(money: Money(amount: 1, currency: usd))

        let balance = bank.balance()

        XCTAssertEqual(balance, Balance(amount: 1, currency: usd))
    }
}
