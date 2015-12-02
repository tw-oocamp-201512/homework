class Taximeter
  PRICE_PER_KM            = 0.8
  FLAG_DISTANCE           = 2
  FLAG_CHARGE             = 6
  EXTRA_CHARGE_MULTIPLIER = 0.5
  EXTRA_CHARGE_DISTANCE   = 8
  STOP_CHARGE_MULTIPLIER  = 0.2

  attr_accessor :distance, :stop_mins

  def initialize(distance, stop_mins=0)
    @distance  = distance
    @stop_mins = stop_mins
  end

  def calculate_charge
    distance_charge  = calculate_distance_charge
    stop_mins_charge = calculate_stop_mins_charge
    (distance_charge + stop_mins_charge).round
  end

  private

  def calculate_distance_charge
    case
    when @distance < FLAG_DISTANCE
      FLAG_CHARGE
    when @distance < EXTRA_CHARGE_DISTANCE && @distance > FLAG_DISTANCE
      charge_exceed_flag_charge
    when @distance > EXTRA_CHARGE_DISTANCE
      charge_exceed_flag_charge + (@distance - EXTRA_CHARGE_DISTANCE) * (1 + EXTRA_CHARGE_MULTIPLIER)
    end
  end

  def charge_exceed_flag_charge
    FLAG_CHARGE + (@distance - FLAG_DISTANCE) * PRICE_PER_KM
  end

  def calculate_stop_mins_charge
    STOP_CHARGE_MULTIPLIER * @stop_mins
  end
end
