*****************************Request For Employee********************
{
	"param1" : "Rahul Singh",
	"param2" : "employee",
	"map" : {
		"designation" : "Developer",
		"address_list" : [
			{
				"flatNo" : "A904",
				"area" : "Sector-15, Belapur",
				"city" : "Navi Mumbai",
				"state" : "Maharastra",
				"country" : "India"
			}
		]
	}
	
}

*****************************Response For Employee********************
{
  "status": "S200",
  "statusDiscription": "Success",
  "map": {
    "employee": {
      "id": 2,
      "name": "Rahul Singh",
      "designation": "Developer",
      "addresses": [
        {
          "id": 1,
          "flatNo": "A904",
          "area": "Sector-15, Belapur",
          "city": "Navi Mumbai",
          "state": "Maharastra",
          "country": "India",
          "addressType": "employee"
        }
      ]
    },
    "person": {
      "id": 2,
      "name": "Rahul Singh",
      "type": "employee"
    }
  }
}

*****************************Request For Student********************
{
	"param1" : "Rahul Singh",
	"param2" : "student",
	"map" : {
		"address_list" : [
			{
				"flatNo" : "A904",
				"area" : "Sector-15, Belapur",
				"city" : "Navi Mumbai",
				"state" : "Maharastra",
				"country" : "India"
			}
		]
	}
	
}

*****************************Response For Student********************
{
  "status": "S200",
  "statusDiscription": "Success",
  "map": {
    "student": {
      "id": 1,
      "name": "Rahul Singh",
      "addresses": [
        {
          "id": 2,
          "flatNo": "A904",
          "area": "Sector-15, Belapur",
          "city": "Navi Mumbai",
          "state": "Maharastra",
          "country": "India",
          "addressType": "student"
        }
      ]
    },
    "person": {
      "id": 1,
      "name": "Rahul Singh",
      "type": "student"
    }
  }
}
