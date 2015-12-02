require 'colorize'
require './app/taximeter.rb'
require './lib/checker.rb'
require './lib/input_error.rb'

puts '请输入里程（公里）'
distance = gets.chomp
puts '请输入等待时间（分钟）:'
stop_mins = gets.chomp

if Checker.check_input(distance) && Checker.check_input(stop_mins)
  total_charge = Taximeter.new(distance.to_i, stop_mins.to_i).calculate_charge
  puts ("*" * 60).colorize(:yellow)

  puts "The tatal_charge is #{total_charge}"

  puts ("*" * 60).colorize(:yellow)
end
