package com.example.proudectnew11.data

import com.example.proudectnew11.R
import com.example.proudectnew11.model.product

class datasource {

    fun loadProduct(): List<product>{
        return listOf(
            product(R.drawable.iphone13,"4500 SR","5",true, 5),
            product(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy S21 Ultra","4500 SR",false,5),
            product(R.drawable.xiaomi_pro," Xiaomi 11T Pro","2000 SR",true,0),
            product(R.drawable.huawei_yp,"Huawei Y6p","500",false,0),
            product(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy Z Flip3","5000 SR",true,70),
            product(R.drawable.iphone,"Iphone 13","6000 SR",true,36)
            )
    }

    }
