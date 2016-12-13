//
//  bank.swift
//  bank
//
//  Created by Daniele Conti on 13/12/2016.
//  Copyright © 2016 Daniele Conti. All rights reserved.
//

import Foundation

class Bank {
    let settings: Settings
    
    init(settings: Settings) {
        self.settings = settings
    }
    
    func credit(money: Money) {
        fatalError()
    }
    
    func debit(money: Money) {
        fatalError()
    }
    
    func balance() -> Balance {
        fatalError()
    }
}

struct Settings {
    let initialBalance: Balance
    let currency: Currency
}

struct Currency: Equatable {
    let name: String
    let ratio: Float
    
    static func ==(lhs: Currency, rhs: Currency) -> Bool {
        return lhs.name == rhs.name &&
            lhs.ratio == rhs.ratio
    }

}

struct Balance: Equatable {
    let amount: Float
    let currency: Currency
    
    static func ==(lhs: Balance, rhs: Balance) -> Bool {
        return lhs.amount == rhs.amount &&
          lhs.currency == rhs.currency
    }
}

struct Money: Equatable {
    let amount: Float
    let currency: Currency
    
    static func ==(lhs: Money, rhs: Money) -> Bool {
        return lhs.amount == rhs.amount &&
            lhs.currency == rhs.currency
    }
}





