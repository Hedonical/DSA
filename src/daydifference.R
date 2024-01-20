library(lubridate)

day_difference <- function(start, end){
  # start: string of date in mm/dd/YYYY format
  # end: string of date in mm/dd/YYYY format
  # takes two strings representing dates and finds the number of days difference
  # between them, returns an int representing the number of days
  
  start <- lubridate::mdy(start)
  
  end <- lubridate::mdy(end)
  
  return(as.numeric(end - start))
}