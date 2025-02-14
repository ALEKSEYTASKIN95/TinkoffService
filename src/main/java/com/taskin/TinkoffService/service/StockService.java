package com.taskin.TinkoffService.service;

import com.taskin.TinkoffService.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
