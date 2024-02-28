package com.eauction.sellerservice;

import com.common.Item;

public interface Seller {
    SellerQueryResult addSellItems(Item item);
    SellerQueryResult updateDutchAuctionprice(int itemId, double newprice);
}
