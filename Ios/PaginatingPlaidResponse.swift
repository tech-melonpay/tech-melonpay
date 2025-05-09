//
//  PaginatingPlaidResponse.swift
//  Bank
//
//  Created by Ayden Panhuyzen on 2017-12-03.
//  Copyright © 2017 Ayden Panhuyzen. All rights reserved.
//

import Foundation

public protocol PaginatingPlaidResponse: PlaidResponse {
    var total: Int { get }
}
