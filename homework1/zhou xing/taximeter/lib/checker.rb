require 'colorize'

class Checker
  class << self
    def check(theme, error="", &block)
      begin
        block.call
      rescue InputError => e
        puts ("\n")
        puts ('-' * 60).colorize(:red)
        puts error
        puts ('-' * 60).colorize(:red)
        exit
      end
    end

    def check_input(input)
      check "#{input}", "#{input} should be a number" do
        p input.class
        raise InputError unless is_number? input
      end

      check "{input}", "#{input} should greater than 0" do
        raise InputError if input.to_i < 0
      end

      true
    end

    private

    def is_number? string
      true if Float(string) rescue false
    end
  end
end
